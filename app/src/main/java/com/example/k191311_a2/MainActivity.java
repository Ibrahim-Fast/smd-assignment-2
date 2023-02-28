package com.example.k191311_a2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.k191311_a2.view.interface_view;
import com.example.k191311_a2.controller.controller;
import com.example.k191311_a2.model.accumulator;
import com.example.k191311_a2.controller.interface_controller;

public class MainActivity extends AppCompatActivity implements interface_view {

    accumulator a=new accumulator();
    controller c = new controller(a);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void button_operation(View v) {
        TextView r1 = (TextView) findViewById(R.id.v1);
        TextView r2 = (TextView) findViewById(R.id.v2);
        TextView r3 = (TextView) findViewById(R.id.operation);

        String n1 = (String) r1.getText();
        String n2 = (String) r2.getText();
        String n3 = (String) r3.getText();

        Log.d("in case", "operation: " + n1 + n2 + n3);
        String s = (String) v.getTag();

        if (s.equals("ac")) {
            r1.setText("0");
            r2.setText("0");
            r3.setText("n");
            a.set_a1(0);
            a.set_a2(0);
            a.set_operation("n");
            r3.setVisibility(View.INVISIBLE);
            r2.setVisibility(View.INVISIBLE);
            return;
        }


        if (s.equals("x")) {
            r1.setText("0");
            r2.setText(n1);
            r3.setText("x");
            c.set_n1("0");
            c.set_n2(n1);
            c.set_operation("x");
            r2.setVisibility(View.VISIBLE);
            r3.setVisibility(View.VISIBLE);
            return;
        }

        if (s.equals("-")) {
            r1.setText("0");
            r2.setText(n1);
            r3.setText("-");
            c.set_n1("0");
            c.set_n2(n1);
            c.set_operation("-");
            r2.setVisibility(View.VISIBLE);
            r3.setVisibility(View.VISIBLE);
            return;
        }
        if (s.equals("+")) {
            r1.setText("0");
            r2.setText(n1);
            r3.setText("+");
            c.set_n1("0");
            c.set_n2(n1);
            c.set_operation("+");
            r2.setVisibility(View.VISIBLE);
            r3.setVisibility(View.VISIBLE);
            return;
        }
        if (s.equals("/")) {
            r1.setText("0");
            r2.setText(n1);
            r3.setText("/");
            c.set_n1("0");
            c.set_n2(n1);
            c.set_operation("/");
            r2.setVisibility(View.VISIBLE);
            r3.setVisibility(View.VISIBLE);
            return;
        }

        if (s.equals("=")) {
            c.set_n1(n1);
            c.set_operation(n3);
            r1.setText(c.give_result());
            r2.setText("0");
            r2.setVisibility(View.INVISIBLE);
            r3.setVisibility(View.INVISIBLE);
            return;
        }

    }

    @Override
    public void button_number(View v) {

        String s = (String) v.getTag();
        TextView r1 = (TextView) findViewById(R.id.v1);

        String n1 = (String) r1.getText();

        if (s.equals("0") && n1.equals("0")) {
            return;
        }
        if (n1.equals("0")) {
            r1.setText(s);
            return;
        }


        r1.setText(n1 + s);


        Log.d("debug", "func_number: hello" + v.getTag());
        return;
    }
}