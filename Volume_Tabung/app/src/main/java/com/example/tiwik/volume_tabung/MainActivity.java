package com.example.tiwik.volume_tabung;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input_phi,input_tinggi,input_jari_jari;
    Button hitung;
    TextView text_volume;
    int jari,tinggi;
    float volume;
    String volum="hasil dari volume balok adalah ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_phi=(EditText)findViewById(R.id.input_phi);
        input_tinggi=(EditText)findViewById(R.id.input_tinggi);
        input_jari_jari=(EditText)findViewById(R.id.input_jari_jari);
        hitung=(Button)findViewById(R.id.isi);
        text_volume=(TextView)findViewById(R.id.text_volume);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                3.14 * r*r*t
                jari= Integer.parseInt(input_jari_jari.getText().toString());
                tinggi= Integer.parseInt(input_tinggi.getText().toString());
                volume = (float) (3.14 * jari*jari*tinggi);
                text_volume.setText((int) volume);

            }
        });
    }
}
