package com.cursoandroid.app6caraoucoroa;

import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        ImageView caraOuCoroa = findViewById(R.id.caraOuCoroa);
        int resultado = new Random().nextInt(2);
        caraOuCoroa.setImageResource((resultado == 0)? R.drawable.cara: R.drawable.coroa);

        Button buttonVoltar = findViewById(R.id.buttonVoltar);
        buttonVoltar.setOnClickListener(
                v-> finish()
        );
    }
}