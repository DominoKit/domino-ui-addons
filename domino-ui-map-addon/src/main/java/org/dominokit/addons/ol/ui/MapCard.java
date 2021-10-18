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
package org.dominokit.addons.ol.ui;

import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.ui.cards.Card;
import org.dominokit.domino.ui.utils.BaseDominoElement;

/** TODO Use inheritance when static factory methods of {@link Card} are removed. */
public class MapCard extends BaseDominoElement<HTMLDivElement, MapCard> {

  private Card mapCard;

  public MapCard(String mapId) {
    this(mapId, null);
  }

  public MapCard(String mapId, String title) {

    this.mapCard = new Card();

    if (title != null) {
      this.mapCard.setTitle(title);
    }

    init(this);
    this.mapCard.fitContent();
    this.mapCard.getBody().setId(mapId);
  }

  @Override
  public HTMLDivElement element() {
    return this.mapCard.element();
  }

  public final Card getCard() {
    return this.mapCard;
  }
}
