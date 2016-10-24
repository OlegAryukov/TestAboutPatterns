package ru.aryukov.factory;

import ru.aryukov.abstr.AbstractFoodFactory;
import ru.aryukov.interf.Desert;
import ru.aryukov.interf.Drink;
import ru.aryukov.interf.Food;
import ru.aryukov.model.desert.traditional.SimpleCheesCacke;
import ru.aryukov.model.drink.traditional.Viskey;
import ru.aryukov.model.food.traditional.Steak;

/**
 * Created by oaryukov on 13.10.2016.
 */
public class TraditionalFactory implements AbstractFoodFactory {
    @Override
    public Food makeFood() {
        return new Steak();
    }

    @Override
    public Drink makeDrink() {
        return new Viskey();
    }

    @Override
    public Desert makeDesert() {
        return new SimpleCheesCacke();
    }
}
