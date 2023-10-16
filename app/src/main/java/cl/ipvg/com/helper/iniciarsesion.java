package cl.ipvg.com.helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class iniciarsesion extends AppCompatActivity {

 EditText iniciarsesionusuario;
 EditText iniciarsesioncontraseña;
 Button iniciarsesioningresar;
 Button iniciarsesionvolver;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciarsesion);

        Intent intentvolver;
        intentvolver= new Intent(this, MainActivity.class);

        iniciarsesionusuario = (EditText) findViewById(R.id.iniciarsesionusuario);
        iniciarsesioncontraseña= (EditText) findViewById(R.id.iniciarsesioncontraseña);
        iniciarsesioningresar = (Button) findViewById(R.id.iniciarsesioningresar);
        iniciarsesioningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iniciarsesionvolver = (Button) findViewById(R.id.iniciarsesionvolver);
        iniciarsesionvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}