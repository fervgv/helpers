package cl.ipvg.com.helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button iniciarsesion;
    Button registrarse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intentiniciar;
        intentiniciar = new Intent(this,iniciarsesion.class);

        Intent intentregistrarse;
        intentregistrarse = new Intent(this, registro.class);


        iniciarsesion= (Button) findViewById(R.id.iniciarsesion);
        iniciarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentiniciar);


            }
        });
        registrarse= (Button) findViewById(R.id.registrarse);
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentregistrarse);

            }
        });

    }
}