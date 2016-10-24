package ru.aryukov.abstr;

import ru.aryukov.interf.Desert;

/**
 * Created by oaryukov on 11.10.2016.
 */
public abstract class DesertDecorator implements Desert {
    protected final Desert desert;

    public DesertDecorator(Desert desert) {
        this.desert = desert;
    }
    @Override
    public int getPrice(){
        return desert.getPrice();
    }

    @Override
    public String getInfo(){
        return desert.getInfo();
    }
}
