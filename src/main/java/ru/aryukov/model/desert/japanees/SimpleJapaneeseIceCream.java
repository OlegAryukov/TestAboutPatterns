package ru.aryukov.model.desert.japanees;

import ru.aryukov.interf.Desert;

/**
 * Created by oaryukov on 11.10.2016.
 */
public class SimpleJapaneeseIceCream implements Desert {
    public int getPrice() {
        return 150;
    }

    public String getInfo() {
        return "Japaneese IceCreame";
    }
}
