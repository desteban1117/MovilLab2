package com.example.admon_lis.logueosqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LayoutLogueoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_logueo);

        TextView textv = (TextView) findViewById(R.id.editText3);

        textv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registro =   new Intent(getApplicationContext(), Registro.class);
                startActivity(registro);
            }
        });
    }
}
