package com.example.veterinrio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();

        Intent intent = getIntent();
        String Nome = intent.getStringExtra(MainActivity.EXTRA_MESSAGE3);
        TextView text = findViewById(R.id.txtNomeh);
        text.setText(Nome);

        String at1 = null;
        TextView castrar = findViewById(R.id.txtCast);
        at1 = extras.getString(MainActivity.EXTRA_MESSAGE);
        String texto1 = String.format(at1);
        castrar.setText(texto1);

        String at2 = null;
        TextView animal = findViewById(R.id.txtanimal);
        at2 = extras.getString(MainActivity.EXTRA_MESSAGE2);
        String texto2 = String.format(at2);
        animal.setText(texto2);


    }
}
