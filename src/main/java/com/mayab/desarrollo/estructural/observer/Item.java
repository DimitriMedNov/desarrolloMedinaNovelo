package com.mayab.desarrollo.estructural.observer;
import java.util.List;
import java.util.ArrayList;

public class Item implements Subject {
    private List<Observer> observers;
    private String name;
    private float price;

    public Item(String name, float price) {
        this.observers = new ArrayList<>();
        this.name = name;
        this.price = price;
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
    public String getName() {
        return name;
    }

}
