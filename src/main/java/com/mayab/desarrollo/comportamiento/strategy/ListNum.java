package com.mayab.desarrollo.comportamiento.strategy;

public class ListNum {
    public Sort_Bahavior sb;
    public int[] arr;
    public ListNum(int[] arr, Sort_Bahavior sb) {
        this.arr = arr;
        this.sb = sb;
    }

    public void display() {
        for (int element : this.arr) {
            System.out.println(element);
        }
    }
    public void performSort() {
        this.sb.sort(this.arr);
    }
    public void setSb(Sort_Bahavior sb) {
        this.sb = sb;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
