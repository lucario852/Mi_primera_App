package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getExtra();
    }

    public void goToPantallaAtras(View view)
    {
        Intent newIntent = new Intent(this,MainActivity.class);
        newIntent.putExtra("msg", "Hola siguiente pantalla");
        startActivity(newIntent);
    }

    public void getExtra()
    {
        Bundle extras=getIntent().getExtras();
        String mensaje = extras.getString("msg");
        String saludo = extras.getString("Saludo");
        Toast.makeText(this, mensaje + ", " + saludo, Toast.LENGTH_SHORT).show();
        Log.i("Informacion", mensaje + ", "+saludo);
    }
}