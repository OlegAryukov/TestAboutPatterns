package ru.aryukov.model.drink.traditional;

import ru.aryukov.interf.Drink;

/**
 * Created by oaryukov on 11.10.2016.
 */
public class Viskey implements Drink {
    public int getPrice() {
        return 250;
    }

    public String getInfo() {
        return "Glass of viskey";
    }
}
