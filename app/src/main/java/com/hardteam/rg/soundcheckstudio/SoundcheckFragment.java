package com.hardteam.rg.soundcheckstudio;

import android.os.Bundle;
import android.support.annotation.Nullable;
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
        View soundcheckView = inflater.inflate(R.layout.soundcheck_fragment, container, false);
        getActivity().setTitle("Репетиционная база");
        return soundcheckView;
    }
}
