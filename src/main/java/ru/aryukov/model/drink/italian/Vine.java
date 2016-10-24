package ru.aryukov.model.drink.italian;

import ru.aryukov.interf.Drink;

/**
 * Created by oaryukov on 11.10.2016.
 */
public class Vine implements Drink {
    public int getPrice() {
        return 150;
    }

    public String getInfo() {
        return "Glass of vine";
    }
}
