package com.example.flightcontrollerapplication;

import androidx.fragment.app.Fragment;

public class MainWindowActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new MainWindowFragment();
    }
}