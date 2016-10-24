package ru.aryukov.model.topings.desert;

import ru.aryukov.abstr.DesertDecorator;
import ru.aryukov.interf.Desert;

/**
 * Created by oaryukov on 13.10.2016.
 */
public class Chocleet extends DesertDecorator {
    public Chocleet(Desert desert) {
        super(desert);
    }
    @Override
    public int getPrice() {
        return desert.getPrice() + 15;
    }

    @Override
    public String getInfo() {
        return desert.getInfo() + " with chokleet";
    }
}
