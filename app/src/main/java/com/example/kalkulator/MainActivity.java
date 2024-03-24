package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Angka1, Angka2;
    TextView Hasil;
    Button tambah,kurang,kali,bagi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Angka1 = findViewById(R.id.angka1);
        Angka2 = findViewById(R.id.angka2);
        Hasil = findViewById(R.id.hasil);

        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);
    }
    public void tambah(View view){
        double angka1 = Double.parseDouble(Angka1.getText().toString());
        double angka2 = Double.parseDouble(Angka2.getText().toString());
        double hasil = 0;
        if (view.getId() == R.id.tambah){
            hasil = angka1 + angka2;
            Hasil.setText("Hasil Penjumlahan : "+hasil);
        }
    }
    public void kurang(View view){
        double angka1 = Double.parseDouble(Angka1.getText().toString());
        double angka2 = Double.parseDouble(Angka2.getText().toString());
        double hasil = 0;
        if (view.getId() == R.id.kurang){
            hasil = angka1 - angka2;
            Hasil.setText("Hasil Pengurangan : "+hasil);
        }
    }
    public void kali(View view){
        double angka1 = Double.parseDouble(Angka1.getText().toString());
        double angka2 = Double.parseDouble(Angka2.getText().toString());
        double hasil = 0;
        if (view.getId() == R.id.kali){
            hasil = angka1 * angka2;
            Hasil.setText("Hasil Perkalian : "+hasil);
        }
    }
    public void bagi(View view) {
        double angka1 = Double.parseDouble(Angka1.getText().toString());
        double angka2 = Double.parseDouble(Angka2.getText().toString());
        double hasil = 0;
        if (view.getId() == R.id.bagi) {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                Hasil.setText("Hasil Pembagian : " + hasil);
            } else {
                Hasil.setText("Tidak dapat membagi dengan Nol");
            }
        }
    }
}