package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int num1;
    int num2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent =getIntent();

        String edt1 = intent.getStringExtra("NUM_ONE");
        String edt2 = intent.getStringExtra("NUM_TWO");
        num1 = Integer.parseInt(edt1.toString());
        num2 = Integer.parseInt(edt2.toString());

        /*TextView txt2 = (TextView)findViewById(R.id.textView4);
        TextView txt3 = (TextView)findViewById(R.id.textView5);
        txt2.setText(Integer.toString(num1));
        txt3.setText(Integer.toString(num2));*/

        EditText edit1 = findViewById(R.id.editTextNumber1);
        EditText edit2 = findViewById(R.id.editTextNumber2);
        edit1.setText(Integer.toString(num1));
        edit2.setText(Integer.toString(num2));
    }

    public void onClickAdd(View v){
        TextView txt1 = (TextView)findViewById(R.id.textView3);
        int sum = num1+num2;
        txt1.setText(Integer.toString(num1)+ " + " +Integer.toString(num2)+" = " +Integer.toString(sum));
    }

    public void onClickMin(View v){
        TextView txt1 = (TextView)findViewById(R.id.textView3);
        int min = num1-num2;
        txt1.setText(Integer.toString(num1)+ " - " +Integer.toString(num2)+" = " +Integer.toString(min));
    }

    public void onClickMultiple(View v){
        TextView txt1 = (TextView)findViewById(R.id.textView3);
        int multiply = num1*num2;
        txt1.setText(Integer.toString(num1)+ " * " +Integer.toString(num2)+" = " +Integer.toString(multiply));
    }

    public void onClickDivide(View v){
        TextView txt1 = (TextView)findViewById(R.id.textView3);
        int dev = num1/num2;
        txt1.setText(Integer.toString(num1)+ " / " +Integer.toString(num2)+" = " +Integer.toString(dev));
    }
}