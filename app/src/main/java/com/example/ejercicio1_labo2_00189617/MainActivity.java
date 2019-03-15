package com.example.ejercicio1_labo2_00189617;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView username;
    TextView password;
    TextView texto;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(TextView)findViewById(R.id.username);
        password=(TextView)findViewById(R.id.password);
        texto=(TextView)findViewById(R.id.texto);
        boton=(Button)findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String texto1= username.getText().toString();
                texto.setText(texto1);

            }
        });

        boton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                String texto2= password.getText().toString();
                texto.setText(texto2);
                return true;
            }
        });



    }
}
