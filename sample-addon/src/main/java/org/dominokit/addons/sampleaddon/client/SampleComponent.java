package org.dominokit.addons.sampleaddon.client;

import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.ui.utils.BaseDominoElement;
import org.dominokit.domino.ui.utils.DominoElement;

import static org.jboss.gwt.elemento.core.Elements.h;

public class SampleComponent extends BaseDominoElement<HTMLDivElement, SampleComponent> {

    private DominoElement<HTMLDivElement> root = DominoElement.div();

    public SampleComponent() {
        init(this);
        root.appendChild(h(1).textContent("Sample component"));
    }

    @Override
    public HTMLDivElement asElement() {
        return root.asElement();
    }
}
