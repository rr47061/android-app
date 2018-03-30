package com.example.rohitranjan.logfiletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View v)
    {
        EditText e1=(EditText) findViewById(R.id.editText);
        EditText e2=(EditText) findViewById(R.id.editText2);
        EditText e3=(EditText)findViewById(R.id.editText3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1  + num2;
        e3.setText(Integer.toString(sum));

    }

    public void Subtract(View v)
    {
        EditText e1=(EditText) findViewById(R.id.editText);
        EditText e2=(EditText) findViewById(R.id.editText2);
        EditText e3=(EditText)findViewById(R.id.editText3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int subtract = num1-num2;
        e3.setText(Integer.toString(subtract));
    }
}
