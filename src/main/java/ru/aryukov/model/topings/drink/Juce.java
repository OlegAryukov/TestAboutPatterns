package ru.aryukov.model.topings.drink;

import ru.aryukov.abstr.DrinkDecorator;
import ru.aryukov.interf.Drink;

/**
 * Created by oaryukov on 13.10.2016.
 */
public class Juce extends DrinkDecorator {
    public Juce(Drink drink) {
        super(drink);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 30;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
