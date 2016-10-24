package ru.aryukov.model.food.traditional;

import ru.aryukov.interf.Food;

/**
 * Created by oaryukov on 13.10.2016.
 */
public class Steak implements Food {
    @Override
    public int getPrice() {
        return 300;
    }

    @Override
    public String getInfo() {
        return "Meat Steak";
    }
}
