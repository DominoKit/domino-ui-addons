package org.dominokit.addons.sample;

import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.ui.utils.BaseDominoElement;
import org.dominokit.domino.ui.utils.DominoElement;

import static org.jboss.elemento.Elements.h;

public class SampleComponent extends BaseDominoElement<HTMLDivElement, SampleComponent> {

    private DominoElement<HTMLDivElement> root = DominoElement.div();

    public SampleComponent() {
        init(this);
        root.appendChild(h(1).textContent("Sample component"));
    }

    @Override
    public HTMLDivElement element() {
        return root.element();
    }
}
