package com.mayab.desarrollo.estructural.decorator;

public class HBO extends ReciboDecorator {
    Recibo recibobase;

    public HBO(Recibo recibobase) {
        this.recibobase =recibobase;
    }

    public String getDescription() {
        return "HBO";
    }

    public double cost() {
        return this.recibobase.cost() + 50;
    }
}
