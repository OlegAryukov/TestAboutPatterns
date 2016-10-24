package ru.aryukov.model.food.italian;

import ru.aryukov.interf.Food;

/**
 * Created by oaryukov on 11.10.2016.
 */
public class SimplePizza implements Food {
    public SimplePizza() {
    }

    public int getPrice() {
        return 300;
    }

    public String getInfo() {
        return "Simple Pizza";
    }
}
