package com.example.llamarcolores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button llamar;
private RadioButton rbdhombre, rbdmujer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llamar =(Button) findViewById(R.id.btnllamar);
        rbdmujer =(RadioButton) findViewById(R.id.rbdmujer);
        rbdhombre =(RadioButton) findViewById(R.id.rbdhombre);

        llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rbdhombre.isChecked()){
                    Intent LlamandoVentanaMan = new Intent(MainActivity.this, hombre.class);
                    startActivity(LlamandoVentanaMan);
                    finish();
                }else if(rbdmujer.isChecked()){
                    Intent LlamandoVentana = new Intent(MainActivity.this, mujer.class);
                    startActivity(LlamandoVentana);
                    finish();
                }else{
                    Toast.makeText(MainActivity.this, "Seleccione una opcion", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}