package com.example.seansabour.mapsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by maritzaabzun on 3/14/15.
 */
public class DiningActivity extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dining);

        View OE_button = findViewById(R.id.OE_button);
        OE_button.setOnClickListener(this);
        View DC_button = findViewById(R.id.DC_button);
        DC_button.setOnClickListener(this);
        View Montes_button = findViewById(R.id.Montes_button);
        Montes_button.setOnClickListener(this);
    }
    public void onClick(View v) {

        if (v.getId() == R.id.OE_button) {
            Intent i = new Intent(this, OtterExpressActivity.class);
            startActivity(i);

        } else if (v.getId() == R.id.DC_button) {
            Intent i = new Intent(this, DiningCommonsActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.Montes_button)
        {
            Intent i = new Intent(this, MontesActivity.class);
            startActivity(i);

        }
    }
}