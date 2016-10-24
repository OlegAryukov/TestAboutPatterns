package ru.aryukov.abstr;

import ru.aryukov.interf.Food;

/**
 * Created by oaryukov on 11.10.2016.
 */
public abstract class FoodDecorator implements Food {
    protected final Food food;

    public FoodDecorator(Food food){
        this.food = food;
    }

    @Override
    public int getPrice(){
        return food.getPrice();
    }

    @Override
    public String getInfo(){
        return food.getInfo();
    }
}
