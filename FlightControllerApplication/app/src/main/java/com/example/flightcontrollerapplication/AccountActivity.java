package com.example.flightcontrollerapplication;

import androidx.fragment.app.Fragment;

/**
 * Activity for managing user accounts.
 *
 * Created by adamcchampion on 2017/08/05.
 */

public class AccountActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new AccountFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_fragment;
    }
}
