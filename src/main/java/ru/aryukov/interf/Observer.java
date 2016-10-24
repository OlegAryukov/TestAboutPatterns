package ru.aryukov.interf;

import ru.aryukov.model.order.Order;

/**
 * Created by oaryukov on 13.10.2016.
 */
public interface Observer {
    public void update(Order order);
}
