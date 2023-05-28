package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {
    TextView tvBmi;
    TextView tvRes;
    EditText kg;
    EditText height;
    Button enter;
    Button geridon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        tvBmi = findViewById(R.id.textViewBmi);
        tvRes = findViewById(R.id.textViewRes);
        kg = findViewById(R.id.editTextKilo);
        height = findViewById(R.id.editTextHeight);
        enter = findViewById(R.id.btnEnter);
        geridon=findViewById(R.id.geri_button);
        geridon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent geri= new Intent(BMI.this,MainActivity.class);
                startActivity(geri);
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myKg = kg.getText().toString();
                String myHeight = height.getText().toString();

                double bmi = calBmi(Double.valueOf(myKg), Double.valueOf(myHeight));
                String result = calRes(bmi);

                tvBmi.setText(String.valueOf(bmi));
                tvRes.setText(result);
            }
        });
    }
    private double calBmi(double kg, double he){
        he = he/100; // this make cm into meter;
        double result = kg/(he*he);
        return result;
    }
    private String calRes(double bmi){
        String result = "Normal";
        if(bmi < 18.5){
            result = "Underweight";
        }else if(bmi > 24.9){
            result = "Overweight";
        }
        return result;
    }

}

