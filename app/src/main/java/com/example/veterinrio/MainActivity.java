package com.example.veterinrio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ToggleButton;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.veterinrio";
    public static final String EXTRA_MESSAGE2 = "com.example.veterinrio2";
    public static final String EXTRA_MESSAGE3 = "com.example.veterinrio3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Registro(View view) {
        ToggleButton A = (ToggleButton) findViewById(R.id.TglCast);
        EditText nome = (EditText) findViewById(R.id.edtname);
        RadioButton rdodog = (RadioButton) findViewById(R.id.rdodog);
        RadioButton rdocat = (RadioButton) findViewById(R.id.rdocat);
        RadioButton rdorabit = (RadioButton) findViewById(R.id.rdorabit);
        RadioButton rdoham = (RadioButton) findViewById(R.id.rdoham);

        String msg, animal;


        if(rdodog.isChecked()){
            animal = "Cachorro selecionado";
        }
        else if(rdocat.isChecked()){
            animal = "Gato selecionado";
        }
        else if(rdorabit.isChecked()){
            animal = "Coelho selecionado";
        }
        else if(rdoham.isChecked()){
            animal = "Hamster selecionado";
        }
        else{
            animal ="";
        }


        if (A.isChecked()){
            msg = "Castrado";
        }
        else{
            msg = "Não Castrado";
        }



        Intent intent = new Intent (this, Main2Activity.class);
        intent.putExtra(EXTRA_MESSAGE, msg);
        intent.putExtra(EXTRA_MESSAGE2, animal);
        String nomeanimal = nome.getText().toString();
        intent.putExtra(EXTRA_MESSAGE3, nomeanimal);
        startActivity(intent);
    }
}



















