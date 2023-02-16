package com.mayab.desarrollo.estructural.decorator;

public class internet extends ReciboDecorator{
    Recibo recibobase;

    public internet(Recibo recibobase) {
        this.recibobase =recibobase;
    }

    public String getDescription() {
        return "Internet";
    }

    public double cost() {
        return this.recibobase.cost() + 250;
    }

}
