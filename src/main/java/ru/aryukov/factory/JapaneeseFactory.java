package ru.aryukov.factory;

import ru.aryukov.abstr.AbstractFoodFactory;
import ru.aryukov.interf.Desert;
import ru.aryukov.interf.Drink;
import ru.aryukov.interf.Food;
import ru.aryukov.model.desert.japanees.SimpleJapaneeseIceCream;
import ru.aryukov.model.drink.japanees.Sacke;
import ru.aryukov.model.food.japanees.SimpleSushi;

/**
 * Created by oaryukov on 13.10.2016.
 */
public class JapaneeseFactory implements AbstractFoodFactory {
    @Override
    public Food makeFood() {
        return new SimpleSushi();
    }

    @Override
    public Drink makeDrink() {
        return new Sacke();
    }

    @Override
    public Desert makeDesert() {
        return new SimpleJapaneeseIceCream();
    }
}
