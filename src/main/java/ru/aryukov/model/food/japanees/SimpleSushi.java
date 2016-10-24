package ru.aryukov.model.food.japanees;

import ru.aryukov.interf.Food;

/**
 * Created by oaryukov on 11.10.2016.
 */
public class SimpleSushi implements Food {
    public int getPrice() {
        return 300;
    }

    public String getInfo() {
        return "Simple Sushi";
    }
}
