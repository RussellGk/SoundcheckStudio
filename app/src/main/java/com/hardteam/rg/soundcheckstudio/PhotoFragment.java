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
public class PhotoFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View photoView = inflater.inflate(R.layout.photo_fragment, container, false);
        getActivity().setTitle("Фото");
        return photoView;
    }
}
