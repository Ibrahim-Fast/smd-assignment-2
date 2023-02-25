package com.example.k191311_a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void operation(View v) {
        TextView r1 = (TextView) findViewById(R.id.r1);
        TextView r2 = (TextView) findViewById(R.id.r2);
        TextView r3 = (TextView) findViewById(R.id.r3);

        String n1 = (String) r1.getText();
        String n2 = (String) r2.getText();
        String n3 = (String) r3.getText();

        Log.d("its me", "operation: " + n1+n2+n3);
        String s = (String) v.getTag();
        if(s.equals("ac")){
            r1.setText("0");
            r2.setText("0");
            r3.setText("n");
            r2.setVisibility(View.INVISIBLE);
            return;
        }

        if(s.equals("x")){
            r1.setText("0");
            r2.setText(n1);
            r3.setText("x");
            r2.setVisibility(View.VISIBLE);
            return;
        }

        if(s.equals("-")){
            r1.setText("0");
            r2.setText(n1);
            r3.setText("-");
            r2.setVisibility(View.VISIBLE);
            return;
        }
        if(s.equals("+")){
            r1.setText("0");
            r2.setText(n1);
            r3.setText("+");
            r2.setVisibility(View.VISIBLE);
            return;
        }
        if(s.equals("/")){
            r1.setText("0");
            r2.setText(n1);
            r3.setText("/");
            r2.setVisibility(View.VISIBLE);
            return;
        }

        if(s.equals("=")){
            double v1= Double.parseDouble(n1);
            double v2= Double.parseDouble(n2);
            double v3=0;
            if(n3.equals("n")){
                return;
            }else
            if(n3.equals("+")){
                v3=v1+v2;
            }else
            if(n3.equals("-")){
                v3=v1-v2;
            }
            else
            if(n3.equals("x")){
                v3=v1*v2;
            }
            else
            if(n3.equals("/")){
                if(v2==0){
                    r1.setText("0");
                    r2.setText("0");
                    r2.setVisibility(View.INVISIBLE);
                    return;
                }
                v3=v1/v2;
            }
            String answer="";

            if(v3 % 1 == 0){
                answer = Integer.toString((int)v3);
            }else {
                answer = Double.toString(v3);
            }

            r1.setText(answer);
            r2.setText("0");
            r2.setVisibility(View.INVISIBLE);
            return;
        }

    }

    public void number(View v) {

        String s = (String) v.getTag();
        TextView r1 = (TextView) findViewById(R.id.r1);
        TextView r2 = (TextView) findViewById(R.id.r2);


        String n1 = (String) r1.getText();

        if (s.equals("0") && n1.equals("0")) {
            return;
        }
        if (n1.equals("0")) {
            r1.setText(s);
            return;
        }


        r1.setText(n1 + s);


        Log.d("its me", "func_number: hello" + v.getTag());
        return;
    }
}