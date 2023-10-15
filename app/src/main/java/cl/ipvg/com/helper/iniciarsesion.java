package cl.ipvg.com.helper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class iniciarsesion extends AppCompatActivity {

 EditText iniciarsesionusuario;
 EditText iniciarsesioncontraseña;
 Button iniciarsesioningresar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciarsesion);

        iniciarsesionusuario = (EditText) findViewById(R.id.iniciarsesionusuario);
        iniciarsesioncontraseña= (EditText) findViewById(R.id.iniciarsesioncontraseña);
        iniciarsesioningresar = (Button) findViewById(R.id.iniciarsesioningresar);
        iniciarsesioningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}