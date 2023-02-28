package com.example.k191311_a2.controller;

import static java.lang.Double.*;

import android.util.Log;

import com.example.k191311_a2.model.accumulator;

public class controller implements interface_controller {
    public accumulator a;

    public controller(accumulator a) {
        this.a=a;
    }

    @Override
    public void set_n1(String s1) {
        a.a1 =0;
        a.a1 = parseDouble(s1);
        Log.d("controller", "set a1 as "+s1);
    }

    @Override
    public void set_n2(String s2) {

        a.a2 =0;
        a.a2 = parseDouble(s2);
        Log.d("controller", "set a2 as "+s2);
    }

    @Override
    public void set_operation(String operation) {

        a.operation = operation;
        Log.d("controller", "set operation as "+operation);
    }


    @Override
    public String give_result() {
        double temp_value = 0;
        String return_value = "0";

        if ((a.operation).equals("ac")) {
            a.a1 = 0;
            a.a2 = 0;
            a.operation = "n";
            return "0";
        } else if ((a.operation).equals("+")) {
            temp_value = a.add();
        } else if ((a.operation).equals("-")) {
            temp_value = a.subtract();
        } else if ((a.operation).equals("x")) {
            temp_value = a.multiply();
        } else if ((a.operation).equals("/")) {
            temp_value = a.divide();
        }else if ((a.operation).equals("n")) {
            temp_value = 0;
        }

        a.a1 = 0;
        a.a2 = 0;
        a.operation = "n";

        if (temp_value % 1 == 0) {
            return_value = Integer.toString((int) temp_value);
        } else {
            return_value = Double.toString(temp_value);
        }
        return return_value;
    }

}
