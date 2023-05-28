package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bmibutton;
    Button ogunbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmibutton=findViewById(R.id.bmi_button);
        ogunbutton=findViewById(R.id.ogun_button);

        bmibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sayfa2= new Intent(MainActivity.this,BMI.class);
                startActivity(sayfa2);
            }
        });
    }
}