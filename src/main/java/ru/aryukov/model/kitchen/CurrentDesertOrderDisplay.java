package ru.aryukov.model.kitchen;

import ru.aryukov.interf.Desert;
import ru.aryukov.interf.Observer;
import ru.aryukov.model.order.Order;
import ru.aryukov.model.order.OrderData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oaryukov on 13.10.2016.
 */
public class CurrentDesertOrderDisplay implements Observer {
    List<Order> currentOrderList = new ArrayList<Order>();
    OrderData orderData;

    public CurrentDesertOrderDisplay(OrderData orderData) {
        this.orderData = orderData;
        orderData.addObserve(this);
    }

    @Override
    public void update(Order order) {
        currentOrderList.add(order);
        show();
    }
    public void show(){

        if(!currentOrderList.get((currentOrderList.size()-1)).getDesertList().isEmpty()) {
            List<Desert> desertList = currentOrderList.get((currentOrderList.size() - 1)).getDesertList();
            for (Desert desert : desertList){
                System.out.println(desert.getInfo());
            }
        }else {
            System.out.println("You have no job now. Smoking...");
        }
    }
}
