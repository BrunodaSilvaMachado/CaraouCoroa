package com.cursoandroid.app6caraoucoroa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonJogar = findViewById(R.id.buttonJogar);
        buttonJogar.setOnClickListener(v -> {
            Intent intent = new Intent(getBaseContext(), ResultadoActivity.class);
            startActivity(intent);
        });
    }
}