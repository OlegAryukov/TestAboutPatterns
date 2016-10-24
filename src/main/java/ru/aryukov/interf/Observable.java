package ru.aryukov.interf;

/**
 * Created by oaryukov on 13.10.2016.
 */
public interface Observable {
    void addObserve(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
