package ru.aryukov.model.kitchen;

import ru.aryukov.interf.Food;
import ru.aryukov.interf.Observer;
import ru.aryukov.model.order.Order;
import ru.aryukov.model.order.OrderData;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by oaryukov on 13.10.2016.
 */
public class CurrentFoodOrderDisplay implements Observer {
    List<Order> currentOrderList = new ArrayList<Order>();
    OrderData orderData;

    public CurrentFoodOrderDisplay(OrderData orderData) {
        this.orderData = orderData;
        orderData.addObserve(this);
    }

    @Override
    public void update(Order order) {
        currentOrderList.add(order);
        show();
    }
    public void show(){

            if(!currentOrderList.get((currentOrderList.size()-1)).getFoodList().isEmpty()) {
                List<Food> foodList = currentOrderList.get((currentOrderList.size() - 1)).getFoodList();
                for (Food food : foodList){
                    System.out.println(food.getInfo());
                }
            }else {
                System.out.println("You have no job now. Smoking...");
            }
    }
}
