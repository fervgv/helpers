package cl.ipvg.com.helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
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


        SensorManager sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        Sensor orientationSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);

    SensorEventListener  orientationListener = new SensorEventListener() {
        {
                onSensorChanged(null);
            }

        @Override
            public void onSensorChanged(SensorEvent event) {
                float azimuth = event.values[0];
                float pitch = event.values[1];
                float roll = event.values[2];

            }
        @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {

            }
        };


        sensorManager.registerListener(orientationListener, orientationSensor, SensorManager.SENSOR_DELAY_NORMAL);



    }
}