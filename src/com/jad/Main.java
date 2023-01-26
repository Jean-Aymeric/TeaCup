package com.jad;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    TeaCup teaCup = new TeaCup();
        CoffeeCup coffeeCup = new CoffeeCup();

        teaCup.setLiquid(new EarlGrey());
        coffeeCup.setLiquid(new Coffee());

        CoffeeCupBoard coffeeCupBoard = new CoffeeCupBoard();
        coffeeCupBoard.add(coffeeCup);

    }
}
