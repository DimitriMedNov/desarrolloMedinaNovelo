package com.mayab.desarrollo.comportamiento.strategy;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Transaction transaction1 = new Transaction(new Date(2022, 1, 1), "Amazon", 100, "Shopping");
        Transaction transaction2 = new Transaction(new Date(2022, 1, 2), "Starbucks", 5, "Food and Drinks");
        Transaction transaction3 = new Transaction(new Date(2022, 1, 3), "Apple", 1500, "Electronics");

        account.addTransaction(transaction1);
        account.addTransaction(transaction2);
        account.addTransaction(transaction3);

        // fecha (por defecto):
        System.out.println("Transacciones ordenadas por fecha:");
        System.out.println(account.getTransactions());

        // ordenar por comercio:
        System.out.println("Transacciones ordenadas por comercio:");
        System.out.println(account.getTransactions());

        // ordenar por cantidad:
        account.setSortingStrategy(new SortByAmount());
        System.out.println("Transacciones ordenadas por cantidad:");
        System.out.println(account.getTransactions());

        // ordenar por categoría:
        account.setSortingStrategy(new SortByCategory());
        System.out.println("Transacciones ordenadas por categoría:");
        System.out.println(account.getTransactions());
    }
}