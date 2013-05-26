package com.github.jknack.css;

import static org.apache.commons.lang3.Validate.notNull;

public class ChildCombinator extends AbstractSelector implements Combinator {
  private Selector parent;

  private Selector child;

  public ChildCombinator(final Selector parent, final Selector child) {
    this.parent = notNull(parent, "The parent can't be null.");
    this.child = notNull(child, "The right can't be null.");
  }

  @Override
  public String nameInternal() {
    return parent.name() + ">" + child.name();
  }

}
