package me.camilogonzalez.portafolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CharSequence initialText = "This will launch my ";
    private int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popularMoviesButton = (Button) findViewById(R.id.popular_movies_button);
        Button stockHawkButton = (Button) findViewById(R.id.stock_hawk_button);
        Button buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        Button makeYourAppMaterialButton = (Button) findViewById(R.id.make_your_app_material_button);
        Button goUbiquitousButton = (Button) findViewById(R.id.go_ubiquitous_button);
        Button capstoneButton = (Button) findViewById(R.id.capstone_button);

        popularMoviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), initialText + "popular movies app", duration).show();
            }
        });

        stockHawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), initialText + "stock hawk app", duration).show();
            }
        });

        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), initialText + "build it bigger app", duration).show();
            }
        });

        makeYourAppMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), initialText + "make your app material app", duration).show();
            }
        });

        goUbiquitousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), initialText + "go ubiquitous app", duration).show();
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), initialText + "capstone app", duration).show();
            }
        });
    }
}
