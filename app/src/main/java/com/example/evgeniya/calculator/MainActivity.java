package com.example.evgeniya.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_pressed(View v) {
        EditText n1 = findViewById(R.id.diners);
        EditText n2 = findViewById(R.id.price);
        EditText result = findViewById(R.id.number_result);
        int addition;
        addition = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());

        result.setText(String.valueOf(addition));

    }
}
