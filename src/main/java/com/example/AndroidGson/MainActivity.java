package com.example.AndroidGson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    private TextView parseadoManual;
    private TextView parseGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.parseadoManual = (TextView) findViewById(R.id.gson_parse_manual);
        this.parseGson = (TextView) findViewById(R.id.gson_parse);

        String objetoJson = "{\"nombre\":\"Matias\", \"mascotas\":[{\"apodo\":\"Bobi\",\"raza\":\"Labrador\"},{\"apodo\":\"Gina\",\"raza\":\"Ovejero\"}]}";

        Persona persona = new Gson().fromJson(objetoJson, Persona.class);
        // Toast.makeText(this, "Nombre: " + persona.getNombre() + " Mascota Apodo: " + persona.getMascotas().get(0).getApodo(), Toast.LENGTH_LONG).show();
        this.parseadoManual.setText(String.format("Nombre: %s Mascota Apodo: %s", persona.getNombre(), persona.getMascotas().get(0).getApodo()));

        String serializacion = new Gson().toJson(persona);
        //Toast.makeText(this,serializacion, Toast.LENGTH_LONG).show();
        this.parseGson.setText(serializacion);
    }
}
