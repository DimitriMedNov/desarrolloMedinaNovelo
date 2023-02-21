package com.mayab.desarrollo.estructural.observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("iPhone X", 1000.0f);
        Alert browserAlert = new BrowserAlert(item, 800.0f);
        Alert mailAlert = new MailAlert(item, 900.0f);
        Alert whatsappAlert = new WhatsAppAlert(item, 1000.0f);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Cambiar el precio del artículo");
            System.out.println("2. Encender o apagar alertas");
            System.out.println("3. Salir");
            int option = scanner.nextInt();
            if (option == 1) {
                System.out.println("Ingrese el nuevo precio del artículo:");
                float price = scanner.nextFloat();
                item.setPrice(price);
            } else if (option == 2) {
                System.out.println("¿Qué alerta desea encender o apagar?");
                System.out.println("1. Notificación por navegador");
                System.out.println("2. Notificación por correo electrónico");
                System.out.println("3. Notificación por WhatsApp");
                int alertOption = scanner.nextInt();
                if (alertOption == 1) {
                    System.out.println("¿Desea encender o apagar la notificación por navegador? (1 = Encender, 0 = Apagar)");
                    int state = scanner.nextInt();
                    if (state == 1) {
                        item.attachObserver(browserAlert);
                    } else {
                        item.detachObserver(browserAlert);
                    }
                } else if (alertOption == 2) {
                    System.out.println("¿Desea encender o apagar la notificación por correo electrónico? (1 = Encender, 0 = Apagar)");
                    int state = scanner.nextInt();
                    if (state == 1) {
                        item.attachObserver(mailAlert);
                    } else {
                        item.detachObserver(mailAlert);
                    }
                } else if (alertOption == 3) {
                    System.out.println("¿Desea encender o apagar la notificación por WhatsApp? (1 = Encender, 0 = Apagar)");
                    int state = scanner.nextInt();
                    if (state == 1) {
                        item.attachObserver(whatsappAlert);
                    } else {
                        item.detachObserver(whatsappAlert);
                    }
                } else {
                    System.out.println("Opción no válida");
                }
            } else if (option == 3) {
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }
    }
}
