package com.example.migranproyecto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Actividad3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
    }

    public void actividad2(View view) {
        startActivity(new Intent(this, Main2Activity.class));
    }

    public void migranspinner(View view) {
        startActivity(new Intent(this, MiSpinner.class));
    }

    public void mitabhost(View view) {
        startActivity(new Intent(this, MiFragmentTabhost.class));
    }

    @Override protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }
    @Override protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override protected void onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
    public void dialogo(View view){

        //Se contruye el diálogo
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Este es mi dialogo")
                .setTitle("Mi primer dialogo...")
                .setCancelable(false)
                .setNeutralButton("Aceptar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

        //Para mostrar el diálogo
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void AcercaDe(View view) {
        startActivity(new Intent(this, AcercaDe.class));
    }

    public void manipulacion(View view) {
        startActivity(new Intent(this, Manipulacion.class));
    }

    public void mirecycler(View view) {
        startActivity(new Intent(this, MiRecyclerView.class));
    }

    public void salir(View view) {
        finish();
    }
}
