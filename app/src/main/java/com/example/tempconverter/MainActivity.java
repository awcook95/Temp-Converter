package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

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

    public void clkConvert(View view){
        TextView txtResultF = findViewById(R.id.txtFResult);
        TextView txtResultC = findViewById(R.id.txtCResult);

        EditText edtTxtF = findViewById(R.id.editF);
        EditText edtTxtC = findViewById(R.id.editC);

        double F = Integer.parseInt(edtTxtF.getText().toString());
        double C = Integer.parseInt(edtTxtC.getText().toString());

        F = (F-32.0)*5.0/9.0;
        C = (C*9.0/5.0)+32.0;

        txtResultF.setText(String.format("%.2f", F));
        txtResultC.setText(String.format("%.2f", C));

    }
}