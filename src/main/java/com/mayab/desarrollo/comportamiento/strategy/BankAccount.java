package com.mayab.desarrollo.comportamiento.strategy;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<Transaction> transactions;
    private SortingStrategy sortingStrategy;

    public BankAccount(double balance) {
        this.balance = balance;
        transactions = new ArrayList<>();
        sortingStrategy = new SortByDate(); // por defecto ordenado por fecha
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return sortingStrategy.sort(transactions);
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}