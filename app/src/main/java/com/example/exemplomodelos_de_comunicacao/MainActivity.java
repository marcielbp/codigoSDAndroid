package com.example.exemplomodelos_de_comunicacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    TextView tvSoma;
    TextView tvSub;
    TextView tvMul;
    TextView tvDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btSoma = findViewById(R.id.button);
        tvSoma= findViewById(R.id.textView);

        Button btSub = findViewById(R.id.button2);
        tvSub= findViewById(R.id.textView2);

        Button btMul = findViewById(R.id.button3);
        tvMul= findViewById(R.id.textView3);

        Button btDiv = findViewById(R.id.button4);
        tvDiv= findViewById(R.id.textView4);
        final RadioButton rdBtnHTTP = findViewById(R.id.radioButton);
        final RadioButton rdBtnSocket = findViewById(R.id.radioButton2);
        final RadioButton rdBtnLocal = findViewById(R.id.radioButton3);

        btSoma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               PrecisaCalcular shc = new PrecisaCalcular(tvSoma);

                if(rdBtnHTTP.isChecked()) {
                    shc.calculoRemotoHTTP(15.0, 15.0, 1);
                }
                else if(rdBtnSocket.isChecked()) {
                    shc.calculoRemoto(15.0, 15.0, 1);
                }
                else{
                    shc.calculoLocal(15.0, 15.0, 1);
                }
            }
        });

        btSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                PrecisaCalcular shc = new PrecisaCalcular(tvSub);

                if(rdBtnHTTP.isChecked()) {
                    shc.calculoRemotoHTTP(15.0, 15.0, 2);
                }
                else if(rdBtnSocket.isChecked()) {
                    shc.calculoRemoto(15.0, 15.0, 2);
                }
                else{
                    shc.calculoLocal(15.0, 15.0, 2);
                }
            }
        });

        btMul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                PrecisaCalcular shc = new PrecisaCalcular(tvMul);

                if(rdBtnHTTP.isChecked()) {
                    shc.calculoRemotoHTTP(15.0, 15.0, 3);
                }
                else if(rdBtnSocket.isChecked()) {
                    shc.calculoRemoto(15.0, 15.0, 3);
                }
                else{
                    shc.calculoLocal(15.0, 15.0, 3);
                }
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                PrecisaCalcular shc = new PrecisaCalcular(tvDiv);
                if(rdBtnHTTP.isChecked()) {
                    shc.calculoRemotoHTTP(15.0, 15.0, 4);
                }
                else if(rdBtnSocket.isChecked()) {
                    shc.calculoRemoto(15.0, 15.0, 4);
                }
                else{
                    shc.calculoLocal(15.0, 15.0, 4);
                }
            }
        });



    }
}
