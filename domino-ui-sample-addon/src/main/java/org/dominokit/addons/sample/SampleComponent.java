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
package org.dominokit.addons.sample;

import static org.jboss.elemento.Elements.h;

import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.ui.utils.BaseDominoElement;
import org.dominokit.domino.ui.utils.DominoElement;

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
