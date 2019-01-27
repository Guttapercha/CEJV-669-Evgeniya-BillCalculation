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
        //data input
        EditText diners = findViewById(R.id.diners);
        EditText price = findViewById(R.id.price);
        EditText tip = findViewById(R.id.tip);

        //data output
        EditText totalPerPerson = findViewById(R.id.lbl_totalPerPerson);
        EditText GST = findViewById(R.id.lbl_GST);
        EditText QST = findViewById(R.id.lbl_QST);
        EditText tips = findViewById(R.id.lbl_tip);
        EditText result = findViewById(R.id.result);

        totalPerPerson.setText(String.valueOf(Double.parseDouble(price.getText().toString())*
                (1 + 0.05 + 0.0975 + Double.parseDouble(tip.getText().toString())/100)));
        GST.setText(String.valueOf(Double.parseDouble(price.getText().toString())*0.05));
        QST.setText(String.valueOf(Double.parseDouble(price.getText().toString())*0.0975));
        tips.setText(String.valueOf(Double.parseDouble(price.getText().toString())*
                (Double.parseDouble(tip.getText().toString())/100)));
        result.setText(String.valueOf(Double.parseDouble(totalPerPerson.getText().toString())*Integer.parseInt(diners.getText().toString())));
    }
}
