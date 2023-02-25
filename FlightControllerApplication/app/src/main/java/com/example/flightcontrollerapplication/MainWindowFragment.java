package com.example.flightcontrollerapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainWindowFragment} factory method to
 * create an instance of this fragment.
 */
public class MainWindowFragment extends Fragment {

    // the fragment initialization parameters
    ImageView squareView;
    Button back_button, run_button, save_button, clear_button;

    private static final String TAG = MainWindowFragment.class.getSimpleName();


    private View MainWindowView;

    public MainWindowFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "OnCreate: Fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "OnCreateView: Fragment");
        // Analysis the xml file for fragment_main_window
        if (MainWindowView == null) {
            MainWindowView = inflater.inflate(R.layout.main_window_fragment, container, false);
        }

        // Find the square and buttons in MainWindowView

        squareView = MainWindowView.findViewById(R.id.square);

        back_button = MainWindowView.findViewById(R.id.back_button);
        run_button = MainWindowView.findViewById(R.id.run_button);
        save_button = MainWindowView.findViewById(R.id.save_button);
        clear_button = MainWindowView.findViewById(R.id.clear_button);

        back_button.setOnClickListener((v) -> {
            startActivity((new Intent(getContext(), MainMenuActivity.class)));
            Log.i(TAG, "Press Back.");
        });

        run_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Press Run.");
                Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.move_animation);
                // TODO: get the value of squareView
                squareView.startAnimation(animation);
            }
        });

        save_button.setOnClickListener((v) -> {
            Log.i(TAG, "Press Save.");
        });

        clear_button.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Press Clear.");
                squareView.clearAnimation();
            }
        }));


        squareView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // prompt out a window shows adding attribute
            }
        });
        return MainWindowView;
    }


}
