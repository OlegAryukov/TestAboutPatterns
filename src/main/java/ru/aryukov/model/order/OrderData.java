package ru.aryukov.model.order;

import ru.aryukov.interf.Observable;
import ru.aryukov.interf.Observer;

import java.util.List;


/**
 * Created by oaryukov on 13.10.2016.
 */
public class OrderData implements Observable {
    List<Observer> kitchensList;
    Order order;

    public Order getOrder() {
        return order;
    }

    @Override
    public void addObserve(Observer o) {
        kitchensList.add(o);

    }

    @Override
    public void removeObserver(Observer o) {

    }


    @Override
    public void notifyObservers() {
        for (Observer observer:kitchensList){
            observer.update(order);
        }

    }

    public void updateOrder(Order order){
        this.order = order;
        notifyObservers();
    }
}
