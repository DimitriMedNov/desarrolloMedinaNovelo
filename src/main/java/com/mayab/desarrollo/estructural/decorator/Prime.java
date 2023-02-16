package com.mayab.desarrollo.estructural.decorator;

public class Prime extends ReciboDecorator{
    Recibo recibobase;

    public Prime(Recibo recibobase) {
        this.recibobase =recibobase;
    }

    public String getDescription() {
        return "Prime";
    }

    public double cost() {
        return this.recibobase.cost() + 50;
    }
}
