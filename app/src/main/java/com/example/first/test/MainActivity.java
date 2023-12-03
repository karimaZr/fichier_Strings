package com.example.first.test;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.example.first.R;

public class MainActivity extends AppCompatActivity {

    private EditText nom;
    private EditText prenom;
    private EditText phone;
    private EditText adresse;
    private Spinner ville;
    private RadioButton f;
    private RadioButton h;
    private Button bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);
        phone = findViewById(R.id.phone);
        adresse = findViewById(R.id.adresse);
        ville = findViewById(R.id.ville);
        f = findViewById(R.id.f);
        h = findViewById(R.id.h);

        bn = findViewById(R.id.bn);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String genre = "";
                if (f.isChecked())
                    genre = getString(R.string.genre_femme);
                else if (h.isChecked())
                    genre = getString(R.string.genre_homme);
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nom", nom.getText().toString());
                intent.putExtra("prenom", prenom.getText().toString());
                intent.putExtra("phone", phone.getText().toString());
                intent.putExtra("adresse", adresse.getText().toString());
                intent.putExtra("ville", ville.getSelectedItem().toString());
                intent.putExtra("genre", genre);
                startActivity(intent);
            }
        });
    }
}
