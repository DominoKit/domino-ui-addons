/*
 * Copyright © 2019 2019 Dominokit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dominokit.addons.ol.presets;

import ol.Coordinate;
import ol.Map;
import ol.MapOptions;
import ol.OLFactory;
import ol.View;
import ol.control.Attribution;
import ol.control.ScaleLine;
import ol.interaction.KeyboardPan;
import ol.interaction.KeyboardZoom;
import ol.layer.LayerOptions;
import ol.layer.Tile;
import ol.proj.Projection;
import ol.source.Osm;
import ol.source.XyzOptions;

public class MapPresets {

  private MapPresets() {
    throw new AssertionError();
  }

  /**
   * Creates a Open Street Map (OSM) map.
   *
   * @param mapId ID of the map container ()
   * @return OSM map
   */
  public static Map getOsmMap(String mapId) {

    // create a OSM-layer
    XyzOptions osmSourceOptions = OLFactory.createOptions();

    Osm osmSource = new Osm(osmSourceOptions);
    LayerOptions osmLayerOptions = OLFactory.createOptions();
    osmLayerOptions.setSource(osmSource);

    Tile osmLayer = new Tile(osmLayerOptions);

    // create a view
    View view = new View();

    Coordinate centerCoordinate = new Coordinate(-0.1275, 51.507222);
    Coordinate transformedCenterCoordinate =
        Projection.transform(centerCoordinate, "EPSG:4326", "EPSG:3857");

    view.setCenter(transformedCenterCoordinate);
    view.setZoom(10);

    // create the map
    MapOptions mapOptions = new MapOptions();
    mapOptions.setTarget(mapId);
    mapOptions.setView(view);

    Map map = new Map(mapOptions);

    map.addLayer(osmLayer);

    // add some controls
    map.addControl(new ScaleLine());

    Attribution attribution = new Attribution();
    attribution.setCollapsed(true);

    map.addControl(attribution);

    // add some interactions
    map.addInteraction(new KeyboardPan());
    map.addInteraction(new KeyboardZoom());

    return map;
  }
}
