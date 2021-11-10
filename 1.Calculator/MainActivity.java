package com.example.a2calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    String op = "+";
    boolean isNewOp = true;
    String oldNumber = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        if(isNewOp)
            ed1.setText("");
        isNewOp= false;
        String num = ed1.getText().toString();
        switch(view.getId()){
            case R.id.But0:
                num += "0";
                break;
            case R.id.But1:
                num += "1";
                break;
            case R.id.But2:
                num += "2";
                break;
            case R.id.But3:
                num += "3";
                break;
            case R.id.But4:
                num += "4";
                break;
            case R.id.But5:
                num += "5";
                break;
            case R.id.But6:
                num += "6";
                break;
            case R.id.But7:
                num += "7";
                break;
            case R.id.But8:
                num += "8";
                break;
            case R.id.But9:
                num += "9";
                break;
            case R.id.ButDot:
                num += ".";
                break;
            case R.id.ButPlusMinus:
                num ="-" + num;
                break;
        }
        ed1.setText(num);
    }

    public void operatorEvent(View view) {
        isNewOp = true;
        oldNumber = ed1.getText().toString();
        switch (view.getId()){
            case R.id.ButAdd: op = "+" ; break;
            case R.id.ButSub: op = "-" ; break;
            case R.id.ButMultiply: op = "*" ; break;
            case R.id.ButDivide: op = "/" ; break;
        }
    }

    public void equalEvent(View view) {
        String newNumber = ed1.getText().toString();
        double result=0.0;
        switch (op){
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;
        }
        ed1.setText(""+result);
    }

    public void ACEvent(View view) {
        ed1.setText("");
        isNewOp = true;
    }
}