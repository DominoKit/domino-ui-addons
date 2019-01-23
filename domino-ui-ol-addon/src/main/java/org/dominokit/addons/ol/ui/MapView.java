package org.dominokit.addons.ol.ui;

import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.ui.utils.BaseDominoElement;
import org.dominokit.domino.ui.utils.DominoElement;

public class MapView extends BaseDominoElement<HTMLDivElement, MapView> {

    private DominoElement<HTMLDivElement> mapContainer = DominoElement.div();

    public MapView(String mapId) {
        init(this);
        this.mapContainer.setAttribute("id", mapId);
    }

    @Override
    public HTMLDivElement asElement() {
        return this.mapContainer.asElement();
    }

}
