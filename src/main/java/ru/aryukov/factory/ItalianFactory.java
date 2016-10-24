package ru.aryukov.factory;

import ru.aryukov.abstr.AbstractFoodFactory;
import ru.aryukov.interf.Desert;
import ru.aryukov.interf.Drink;
import ru.aryukov.interf.Food;
import ru.aryukov.model.desert.italian.SimpleTeramisu;
import ru.aryukov.model.drink.italian.Vine;
import ru.aryukov.model.food.italian.SimplePizza;

/**
 * Created by oaryukov on 13.10.2016.
 */
public class ItalianFactory implements AbstractFoodFactory{
    @Override
    public Food makeFood() {
        return new SimplePizza();
    }

    @Override
    public Drink makeDrink() {
        return new Vine();
    }

    @Override
    public Desert makeDesert() {
        return new SimpleTeramisu();
    }
}
