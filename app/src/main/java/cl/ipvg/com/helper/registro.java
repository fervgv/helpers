package cl.ipvg.com.helper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registro extends AppCompatActivity {
    EditText registronombreusuario;
    EditText registrocontraseñausuario;
    EditText registroconfirmocontraseña;
    Button registroingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        registronombreusuario = (EditText) findViewById(R.id.registronombreusuario);
        registrocontraseñausuario = (EditText) findViewById(R.id.registrocontraseñausuario);
        registroconfirmocontraseña = (EditText) findViewById(R.id.registroconfirmocontraseña);
        registroingresar = (Button) findViewById(R.id.registroingresar);
        registroingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}