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
        Coordinate transformedCenterCoordinate = Projection.transform(centerCoordinate, "EPSG:4326", "EPSG:3857");

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
