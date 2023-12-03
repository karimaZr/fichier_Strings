package com.example.first.test;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.first.R;

public class MainActivity2 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            // Retrieve data from the Intent
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                String nom = extras.getString("nom");
                String prenom = extras.getString("prenom");
                String phone = extras.getString("phone");
                String adresse = extras.getString("adresse");
                String ville = extras.getString("ville");
                String genre=extras.getString("genre");

                // Display the received data in TextViews or any other view as needed
                TextView nomTextView = findViewById(R.id.nomTextView);
                TextView prenomTextView = findViewById(R.id.prenomTextView);
                TextView phoneTextView = findViewById(R.id.phoneTextView);
                TextView adresseTextView = findViewById(R.id.adresseTextView);
                TextView genreTextView = findViewById(R.id.genreTextView);
                TextView villeTextView = findViewById(R.id.villeTextView);

                nomTextView.setText(getString(R.string.label_nom)+""+ nom);
                prenomTextView.setText(getString(R.string.label_prenom)+ prenom);
                phoneTextView.setText(getString(R.string.label_phone)+"" + phone);
                adresseTextView.setText(getString(R.string.label_adresse)+"" + adresse);
                genreTextView.setText(getString(R.string.label_genre)+"" + genre);
                villeTextView.setText(getString(R.string.label_ville )+""+ ville);
            }



}}