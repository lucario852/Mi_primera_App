package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.Touch;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "Metodo onCreate", Toast.LENGTH_SHORT).show();
    }

    public void goToPantallaSiguiente(View view)
    {
        Intent newIntent = new Intent(this,MainActivity2.class);
        newIntent.putExtra("msg", "Hola siguiente pantalla");
        newIntent.putExtra("Saludo","Bienvenido");
        startActivity(newIntent);
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Metodo onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Metodo onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Metodo onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Metodo onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i( "Informacion", "La actividad fue destruida");
        Toast.makeText(getApplicationContext(), "Metodo onDestroy", Toast.LENGTH_LONG).show();
    }


}