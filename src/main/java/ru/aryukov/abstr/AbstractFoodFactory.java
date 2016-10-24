package ru.aryukov.abstr;

import ru.aryukov.interf.Desert;
import ru.aryukov.interf.Drink;
import ru.aryukov.interf.Food;

/**
 * Created by oaryukov on 11.10.2016.
 */
public interface AbstractFoodFactory {
    public Food makeFood();
    public Drink makeDrink();
    public Desert makeDesert();
}
