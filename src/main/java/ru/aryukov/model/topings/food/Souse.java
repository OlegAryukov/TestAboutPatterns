package ru.aryukov.model.topings.food;

import ru.aryukov.abstr.FoodDecorator;
import ru.aryukov.interf.Food;

/**
 * Created by oaryukov on 13.10.2016.
 */
public class Souse extends FoodDecorator {
    public Souse(Food food) {
        super(food);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 30;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " with souse";
    }
}
