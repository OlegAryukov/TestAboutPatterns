package ru.aryukov.abstr;

import ru.aryukov.interf.Drink;

/**
 * Created by oaryukov on 11.10.2016.
 */
public abstract class DrinkDecorator implements Drink {
    protected final Drink drink;

    public DrinkDecorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public int getPrice(){
        return drink.getPrice();
    }

    @Override
    public String getInfo(){
        return drink.getInfo();
    }
}
