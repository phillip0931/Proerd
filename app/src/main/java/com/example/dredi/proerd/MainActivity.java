package com.example.dredi.proerd;

import android.content.Intent;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView maconha,coca,lsd,java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maconha = findViewById(R.id.maconha);
        coca = findViewById(R.id.coca);
        lsd = findViewById(R.id.lsd);
        java = findViewById(R.id.java);

        maconha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Não use Drogas amigão",Toast.LENGTH_SHORT).show();
                Vibrator vibrador = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                long milliseconds = 800;
                vibrador.vibrate(milliseconds);

            }
        });

        coca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),Main3Activity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Não use Drogas amigão",Toast.LENGTH_SHORT).show();
                Vibrator vibrador = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                long milliseconds = 800;
                vibrador.vibrate(milliseconds);

            }
        });

        lsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Não use Drogas amigão",Toast.LENGTH_SHORT).show();
                Vibrator vibrador = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                long milliseconds = 800;
                vibrador.vibrate(milliseconds);
            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main5Activity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"ESSA É A PIOR DROGA",Toast.LENGTH_SHORT).show();
                Vibrator vibrador = (Vibrator) getSystemService(VIBRATOR_SERVICE);
                long milliseconds = 800;
                vibrador.vibrate(milliseconds);
            }
        });
    }
}
