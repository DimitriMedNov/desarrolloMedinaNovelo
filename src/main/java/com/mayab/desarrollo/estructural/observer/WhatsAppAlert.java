package com.mayab.desarrollo.estructural.observer;

public class WhatsAppAlert extends Alert {
    public WhatsAppAlert(Item item, float targetPrice) {
        super(item, targetPrice);
    }

    @Override
    public void update(float price) {
        if (price <= targetPrice) {
            sendNotification(price);
        }
    }

    @Override
    public void sendNotification(float price) {
        System.out.println("¡El precio del artículo " + item.getName() + " ha llegado a $" + price + " y ha sido agregado al carrito! (Notificación por WhatsApp)");
    }
}