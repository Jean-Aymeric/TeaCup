package com.jad;

public abstract class Cup<T extends Liquid> {
    private T liquid;

    public T getLiquid() {
        return liquid;
    }

    public void setLiquid(final T liquid) {
        this.liquid = liquid;
    }
}
