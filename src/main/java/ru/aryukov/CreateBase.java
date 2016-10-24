package ru.aryukov;

import ru.aryukov.abstr.AbstractFoodFactory;
import ru.aryukov.interf.Desert;
import ru.aryukov.interf.Drink;
import ru.aryukov.interf.Food;

/**
 * Created by oaryukov on 14.10.2016.
 */
public class CreateBase {
    public Food makeFood(AbstractFoodFactory foodFactory){
        Food food = foodFactory.makeFood();
        return food;
    }
    public Drink makeDrink(AbstractFoodFactory drinkFactory){
        Drink drink = drinkFactory.makeDrink();
        return drink;
    }
    public Desert makeDesert(AbstractFoodFactory desertFactory){
        Desert desert = desertFactory.makeDesert();
        return desert;
    }

    public Food addTopings(topings<>)
}
