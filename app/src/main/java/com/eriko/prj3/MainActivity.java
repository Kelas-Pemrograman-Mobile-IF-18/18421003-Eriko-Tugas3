package com.eriko.prj3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNilai1, edtNilai2;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNilai1 = (EditText) findViewById(R.id.edtNilai1);
        edtNilai2 = (EditText) findViewById(R.id.edtNilai2);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilai1 = Integer.parseInt(edtNilai1.getText().toString());
                int nilai2 = Integer.parseInt(edtNilai2.getText().toString());
                int hasil  = nilai1 + nilai2;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilai1 = Integer.parseInt(edtNilai1.getText().toString());
                int nilai2 = Integer.parseInt(edtNilai2.getText().toString());
                int hasil  = nilai1 - nilai2;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilai1 = Integer.parseInt(edtNilai1.getText().toString());
                int nilai2 = Integer.parseInt(edtNilai2.getText().toString());
                int hasil  = nilai1 * nilai2;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilai1 = Integer.parseInt(edtNilai1.getText().toString());
                int nilai2 = Integer.parseInt(edtNilai2.getText().toString());
                int hasil  = nilai1 / nilai2;
                txtHasil.setText(String.valueOf(hasil));
            }
        });
    }
}