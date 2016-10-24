package ru.aryukov.model.kitchen;

import ru.aryukov.interf.Drink;
import ru.aryukov.interf.Observer;
import ru.aryukov.model.order.Order;
import ru.aryukov.model.order.OrderData;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by oaryukov on 13.10.2016.
 */
public class CurrentDrinkOrderDisplay implements Observer {
    List<Order> currentOrderList = new ArrayList<Order>();
    OrderData orderData;

    public CurrentDrinkOrderDisplay(OrderData orderData) {
        this.orderData = orderData;
        orderData.addObserve(this);
    }

    @Override
    public void update(Order order) {
        currentOrderList.add(order);
        show();
    }
    public void show(){

        if(!currentOrderList.get((currentOrderList.size()-1)).getDrinkList().isEmpty()) {
            List<Drink> drinkList = currentOrderList.get((currentOrderList.size() - 1)).getDrinkList();
            for (Drink drink : drinkList){
                System.out.println(drink.getInfo());
            }
        }else {
            System.out.println("You have no job now. Smoking...");
        }
    }
}
