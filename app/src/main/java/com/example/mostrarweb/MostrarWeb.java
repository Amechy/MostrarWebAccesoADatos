package com.example.mostrarweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MostrarWeb extends AppCompatActivity implements View.OnClickListener {
    Button btnIr;
    EditText etxNavegar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_web);

        btnIr = (Button) findViewById(R.id.btnIr);
        btnIr.setOnClickListener(this);
        etxNavegar = (EditText) findViewById(R.id.etxNavegar);
    }

    @Override
    public void onClick(View view) {
        if (etxNavegar.getText().toString().substring(0,7) != "http://" || etxNavegar.getText().toString().substring(0,8) != "https://") {
            etxNavegar.setText("http://" + etxNavegar.getText().toString());
        }
        Bundle bundle = new Bundle();
        bundle.putString("webMostrada", etxNavegar.getText().toString());
        Intent intent = new Intent(this, WebMostrada.class);
        intent.putExtras(bundle);
        startActivity(intent);


    }
}
