package com.mayab.desarrollo.comportamiento.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByDate implements SortingStrategy {
    @Override
    public List<Transaction> sort(List<Transaction> transactions) {
        Collections.sort(transactions, Comparator.comparing(Transaction::getDate));
        return transactions;
    }
}

