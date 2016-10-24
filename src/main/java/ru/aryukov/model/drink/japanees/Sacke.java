package ru.aryukov.model.drink.japanees;

import ru.aryukov.interf.Drink;

/**
 * Created by oaryukov on 11.10.2016.
 */
public class Sacke implements Drink {
    public int getPrice() {
        return 100;
    }

    public String getInfo() {
        return "Little bit sake";
    }
}
