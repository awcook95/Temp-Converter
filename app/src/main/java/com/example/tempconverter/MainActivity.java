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

        String fString = edtTxtF.getText().toString();
        String cString = edtTxtC.getText().toString();



        if(fString.matches("") || cString.matches("")){
            return;
        }

        double f = Integer.parseInt(edtTxtF.getText().toString());
        double c = Integer.parseInt(edtTxtC.getText().toString());

        f = (f-32.0)*5.0/9.0;
        c = (c*9.0/5.0)+32.0;

        txtResultF.setText(String.format("%.2f", f));
        txtResultC.setText(String.format("%.2f", c));

    }
}