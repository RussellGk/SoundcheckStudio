package com.hardteam.rg.soundcheckstudio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rg on 3/22/16.
 */
public class SoundcheckFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View soundcheckView = inflater.inflate(R.layout.soundcheck_fragment, container, false);

        FloatingActionButton floatingActionButton = (FloatingActionButton) soundcheckView.findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(soundcheckView, "Form for sending the letter", Snackbar.LENGTH_SHORT).show();

            }
        });

        getActivity().setTitle("Репетиционная база");
        return soundcheckView;


    }
}
