package com.mayab.desarrollo.estructural.observer;

public interface Subject {
    void attachObserver(Observer observer);
    void detachObserver(Observer observer);
    void notifyObservers();
}
