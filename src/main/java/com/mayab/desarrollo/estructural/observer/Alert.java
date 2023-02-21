package com.mayab.desarrollo.estructural.observer;

public abstract class Alert implements Observer {
    protected Item item;
    protected float targetPrice;

    public Alert(Item item, float targetPrice) {
        this.item = item;
        this.targetPrice = targetPrice;
        item.attachObserver(this);
    }

    public void setTargetPrice(float targetPrice) {
        this.targetPrice = targetPrice;
    }

    public void turnOff() {
        item.detachObserver(this);
    }

    public abstract void sendNotification(float price);
}
