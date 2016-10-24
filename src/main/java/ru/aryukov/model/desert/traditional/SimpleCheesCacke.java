package ru.aryukov.model.desert.traditional;

import ru.aryukov.interf.Desert;

/**
 * Created by oaryukov on 11.10.2016.
 */
public class SimpleCheesCacke implements Desert {
    public int getPrice() {
        return 100;
    }

    public String getInfo() {
        return "Traditional CheesCacke";
    }
}
