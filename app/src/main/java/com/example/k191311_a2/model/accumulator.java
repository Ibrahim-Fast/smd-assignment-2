package com.example.k191311_a2.model;

public class accumulator implements interface_accumulator {
    public double a1 = 0;
    public double a2 = 0;
    public String operation = "n";

    public accumulator() {
        a1 = 0;
        a2 = 0;
        operation = "n";
    }

    accumulator(double n1, double n2, String op) {
        this.a1 = n1;
        this.a2 = n2;
        this.operation = op;
    }

    public void set_a1(double n1) {
        this.a1 = n1;
    }

    public void set_a2(double n2) {
        this.a2 = n2;
    }

    public void set_operation(String op) {
        this.operation = op;
    }

    @Override
    public double add() {
        return a2 + a1;
    }

    @Override
    public double multiply() {
        return a1 * a2;
    }

    @Override
    public double divide() {
        if (a1 == 0) {
            return 0;
        }
        return a2 / a1;
    }

    @Override
    public double subtract() {
        return a2 - a1;
    }


}
