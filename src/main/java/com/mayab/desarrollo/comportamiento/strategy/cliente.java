package com.mayab.desarrollo.comportamiento.strategy;

public class cliente {
    public static void main(String[]args){
        int[] arr = {23,52,85,71,1,49,102,73,56,12};
        Sort_Bahavior Insertion = new insertionSort();
        ListNum listadoTest = new ListNum(arr, Insertion);
        listadoTest.performSort();
        listadoTest.display();

    }
}
