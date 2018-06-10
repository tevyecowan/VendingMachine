package tev.vendingmachine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button cocka_cola_button = findViewById(R.id.cocka_cola_button);
        cocka_cola_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CockaCola.class));

            }         });

        final Button foot_beer_button = findViewById(R.id.foot_beer_button);
        foot_beer_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent( MainActivity.this, FootBeer.class));
            }           });

        final Button dr_schlepper_button = findViewById(R.id.dr_schlepper_button);
        dr_schlepper_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent( MainActivity.this, DrSchlepper.class));
            }           });

        final Button grape_soda_button = findViewById(R.id.grape_soda_button);
        grape_soda_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent( MainActivity.this, GrapeSoda.class));
            }           });


    }
}

