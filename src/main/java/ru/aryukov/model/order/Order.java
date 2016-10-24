package ru.aryukov.model.order;

import ru.aryukov.interf.Desert;
import ru.aryukov.interf.Drink;
import ru.aryukov.interf.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oaryukov on 13.10.2016.
 */
public class Order {
    List<Food> foodList = new ArrayList<Food>();
    List<Drink> drinkList = new ArrayList<Drink>();
    List<Desert> desertList = new ArrayList<Desert>();

    public List<Food> getFoodList() {
        return foodList;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public List<Desert> getDesertList() {
        return desertList;
    }

    public void addFood(Food food){
        foodList.add(food);
    }
    public void addDrink(Drink drink){
        drinkList.add(drink);
    }
    public void addDesert(Desert desert){
        desertList.add(desert);
    }
}
