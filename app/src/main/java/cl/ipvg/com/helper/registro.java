package cl.ipvg.com.helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
public class registro extends AppCompatActivity {
    EditText registronombreusuario;
    EditText registrocontraseñausuario;
    EditText registroconfirmocontraseña;
    Button registroingresar;
    Button registrovolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Intent intentvolver;
        intentvolver = new Intent(this, MainActivity.class);
        registronombreusuario = (EditText) findViewById(R.id.registronombreusuario);
        registrocontraseñausuario = (EditText) findViewById(R.id.registrocontraseñausuario);
        registroconfirmocontraseña = (EditText) findViewById(R.id.registroconfirmocontraseña);
        registroingresar = (Button) findViewById(R.id.registroingresar);
        registroingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        registrovolver = (Button) findViewById(R.id.registrovolver);
        registrovolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Spinner yearSpinner = findViewById(R.id.yearSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.years,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        yearSpinner.setAdapter(adapter);
    }
}





