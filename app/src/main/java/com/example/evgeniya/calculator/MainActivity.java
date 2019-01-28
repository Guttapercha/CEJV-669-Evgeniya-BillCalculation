package com.example.evgeniya.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

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
        TextView error = findViewById(R.id.lbl_error);

         if (price.getText().toString().equals("") || diners.getText().toString().equals("") || tip.getText().toString().equals("")) {
             error.setText("Do not leave empty fields");
         } else {
             error.setText("");
             totalPerPerson.setText(String.format(Locale.getDefault(), "%.02f", Double.parseDouble(price.getText().toString())*
                     (1 + 0.05 + 0.09975 + Double.parseDouble(tip.getText().toString())/100)));
             GST.setText(String.format(Locale.getDefault(),"%.02f", Double.parseDouble(price.getText().toString())*0.05));
             QST.setText(String.format(Locale.getDefault(),"%.02f", Double.parseDouble(price.getText().toString())*0.09975));

             tips.setText(String.format(Locale.getDefault(),"%.02f", Double.parseDouble(price.getText().toString())*
                     (Double.parseDouble(tip.getText().toString())/100)));
             result.setText(String.format(Locale.getDefault(),"%.02f", Double.parseDouble(totalPerPerson.getText().toString())*Integer.parseInt(diners.getText().toString())));
         }

        }

    public void btn_pressed_clear(View v) {
        TextView error = findViewById(R.id.lbl_error);
        error.setText("Do not leave empty fields");
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

        totalPerPerson.setText("");
        GST.setText("");
        QST.setText("");
        tips.setText("");
        result.setText("");
        diners.setText("");
        price.setText("");
        tip.setText("");

    }
}
