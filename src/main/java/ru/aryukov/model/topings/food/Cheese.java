package ru.aryukov.model.topings.food;

import ru.aryukov.abstr.FoodDecorator;
import ru.aryukov.interf.Food;

/**
 * Created by oaryukov on 13.10.2016.
 */
public class Cheese extends FoodDecorator {
    public Cheese(Food food) {
        super(food);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 50;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " with cheese";
    }
}
