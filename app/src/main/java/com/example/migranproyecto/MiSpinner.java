package com.example.migranproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MiSpinner extends AppCompatActivity {
    Spinner mispinner;
    String miitem;
    EditText edtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_spinner);

        mispinner=findViewById(R.id.spAnimals);
        edtDescripcion=findViewById(R.id.etDescription);

        //El app tomaría los datos de esta lista y no del array.xml
        List<String> categories = new ArrayList<String>();
        categories.add("Automobile");
        categories.add("Business Services");
        categories.add("Computers");
        categories.add("Education");
        categories.add("Personal");
        categories.add("Travel");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        mispinner.setAdapter(dataAdapter);
        //==========================================================

        mispinner
                .setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
                        // TODO Auto-generated method stub
                        miitem= (String) mispinner.getSelectedItem();
                        if(edtDescripcion.getText().length()>0)
                            edtDescripcion.setText(edtDescripcion.getText()+" ,"+miitem);
                        else
                            edtDescripcion.setText(miitem);
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                        // TODO Auto-generated method stub
                    }
                });
    }
}