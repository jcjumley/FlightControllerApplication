package com.example.flightcontrollerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        findViewById(R.id.buttonNewSimulation).setOnClickListener(this);
        findViewById(R.id.buttonLoadSimulation).setOnClickListener(this);
        findViewById(R.id.buttonSettings).setOnClickListener(this);
        findViewById(R.id.buttonExit).setOnClickListener(this);
    }

    public void onClick(View v) {
        final Context appContext = this.getApplicationContext();
        final int viewId = v.getId();

        if (viewId == R.id.buttonNewSimulation) {
            Log.i(TAG, "New Simulation.");

            // Possible login check
            // if (!userLoggedIn)
            //     startActivity((new Intent(appContext, LoginActivity.class));
            startActivity((new Intent(appContext, MainWindowActivity.class)));
        } else if (viewId == R.id.buttonLoadSimulation) {
            Log.i(TAG, "Load Simulation.");
        } else if (viewId == R.id.buttonSettings) {
            Log.i(TAG, "Settings.");
        } else if (viewId == R.id.buttonExit) {
            Log.i(TAG, "Exit.");
            finish();
        }
    }
}