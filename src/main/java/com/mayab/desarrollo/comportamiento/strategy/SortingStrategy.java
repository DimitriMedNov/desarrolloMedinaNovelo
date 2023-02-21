package com.mayab.desarrollo.comportamiento.strategy;

import java.util.List;

public interface SortingStrategy {
    List<Transaction> sort(List<Transaction> transactions);
}
