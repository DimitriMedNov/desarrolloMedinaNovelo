package com.mayab.desarrollo.comportamiento.strategy;
import java.util.Arrays;
public class burbujaSort implements Sort_Bahavior{
    @Override
    public void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println("Ordenamiento de Burbuja");
    }
}
