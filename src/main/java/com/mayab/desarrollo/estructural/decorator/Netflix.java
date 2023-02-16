package com.mayab.desarrollo.estructural.decorator;


public class Netflix extends ReciboDecorator {
    Recibo recibobase;

    public Netflix(Recibo recibobase) {
        this.recibobase =recibobase;
    }

    public String getDescription() {
        return "Netflix";
    }

    public double cost() {
        return this.recibobase.cost() + 50;
    }
}