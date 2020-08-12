package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FirstActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                openSecondActivity();
                showToast();
            }
        });
    }

    public void openSecondActivity(){
        EditText edt1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText edt2 = (EditText) findViewById(R.id.editTextNumber2);

        String number1 = edt1.getText().toString();
        String number2 = edt2.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("NUM_ONE", number1);
        intent.putExtra("NUM_TWO", number2);

        startActivity(intent);
    }

    public void showToast(){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.customtoast, (ViewGroup)findViewById(R.id.toast_root));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast. setView(layout);

        toast.show();
    }
}