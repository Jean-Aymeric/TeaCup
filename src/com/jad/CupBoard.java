package com.jad;

import java.util.ArrayList;

public abstract class CupBoard<T extends Cup> {
    private ArrayList<T> cups;

    public CupBoard() {
        this.cups = new ArrayList<>();
    }

    public void add(T cup) {
        this.cups.add(cup);
    }
}
