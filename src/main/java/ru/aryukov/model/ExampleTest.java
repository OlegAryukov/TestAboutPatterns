package ru.aryukov.model;

import ru.aryukov.CreateBase;
import ru.aryukov.MakeOrder;
import ru.aryukov.abstr.AbstractFoodFactory;
import ru.aryukov.factory.ItalianFactory;
import ru.aryukov.interf.Food;
import ru.aryukov.model.kitchen.CurrentDesertOrderDisplay;
import ru.aryukov.model.kitchen.CurrentDrinkOrderDisplay;
import ru.aryukov.model.kitchen.CurrentFoodOrderDisplay;
import ru.aryukov.model.order.OrderData;
import ru.aryukov.model.topings.food.Cheese;
import ru.aryukov.model.topings.food.Souse;

/**
 * Created by oaryukov on 13.10.2016.
 */
public class ExampleTest {
    public static void main(String[] args) {
        OrderData orderData = new OrderData();
        CurrentDesertOrderDisplay desertOrderDisplay = new CurrentDesertOrderDisplay(orderData);
        CurrentDrinkOrderDisplay drinkOrderDisplay = new CurrentDrinkOrderDisplay(orderData);
        CurrentFoodOrderDisplay foodOrderDisplay = new CurrentFoodOrderDisplay(orderData);
        MakeOrder makeOrder = new MakeOrder();
        CreateBase base = new CreateBase();

        AbstractFoodFactory italian = new ItalianFactory();
        Food pizza = new Souse(new Cheese(base.makeFood(italian)));
        System.out.println(pizza.getInfo());

    }
}
