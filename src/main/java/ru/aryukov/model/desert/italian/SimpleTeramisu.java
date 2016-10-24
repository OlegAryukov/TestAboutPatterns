package ru.aryukov.model.desert.italian;

import ru.aryukov.interf.Desert;

/**
 * Created by oaryukov on 11.10.2016.
 */
public class SimpleTeramisu implements Desert {

    public int getPrice() {
        return 100;
    }

    public String getInfo() {
        return "Simple Teramisu";
    }
}
