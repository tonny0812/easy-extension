package io.github.xiaoshicae.extension.core;

import io.github.xiaoshicae.extension.core.ability.AbstractAbility;

/**
 * use the default implementation of the extension as a fallback when no business identity or capability matches.
 */
public abstract class BaseDefaultAbility<T> extends AbstractAbility<T> {
    public static final String DEFAULT_CODE = "ability.application.default";

    @Override
    public final String code() {
        return DEFAULT_CODE;
    }

    @Override
    public final Boolean match(T param) {
        return true;
    }
}
