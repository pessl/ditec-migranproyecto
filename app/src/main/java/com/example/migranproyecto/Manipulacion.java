package com.example.migranproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Manipulacion extends AppCompatActivity {
    EditText edtnombre;
    EditText edtmonto;
    TextView txtresultado;
    Button btnejecutar;

    //Este parámetro va verificar el estado para el caso del segundo botón creado.
    int centinela=0;
    Button btnmimodificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipulacion);
        edtnombre=findViewById(R.id.edtnombre);
        edtmonto=findViewById(R.id.edtmonto);
        txtresultado=findViewById(R.id.txtResultado);
        btnejecutar=findViewById(R.id.btncambiar);

        btnmimodificar=findViewById(R.id.btnmodificar);

        //Se usa un escuchador de click
        btnejecutar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double cambio;
                cambio=Double.parseDouble(edtmonto.getText().toString())*3.3;
                txtresultado.setText(edtnombre.getText() + " el monto de "+ edtmonto.getText()+
                        " dolares equivale a " + cambio.toString() + "Soles");
            }
        });
    }

    public void ocultar(View view) {
        if(centinela==0) {
            centinela=1;
            btnejecutar.setVisibility(View.GONE);
            btnmimodificar.setText("MOSTRAR");
        } else {
            centinela=0;
            btnejecutar.setVisibility(View.VISIBLE);
            btnmimodificar.setText("OCULTAR");
        }

    }
}