package com.mayab.desarrollo.estructural.decorator;

public class Disney extends ReciboDecorator{
    Recibo recibobase;

    public Disney(Recibo recibobase) {
        this.recibobase =recibobase;
    }

    public String getDescription() {
        return "Disney";
    }

    public double cost() {
        return this.recibobase.cost() + 100;
    }
}
