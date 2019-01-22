package org.dominokit.addons.ol.client;

import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.ui.utils.BaseDominoElement;
import org.dominokit.domino.ui.utils.DominoElement;

public class MapComponent extends BaseDominoElement<HTMLDivElement, MapComponent> {

    private DominoElement<HTMLDivElement> mapContainer = DominoElement.div();

    public MapComponent(String mapId) {
        init(this);
        this.mapContainer.setAttribute("id", mapId);
    }

    @Override
    public HTMLDivElement asElement() {
        return this.mapContainer.asElement();
    }

}
