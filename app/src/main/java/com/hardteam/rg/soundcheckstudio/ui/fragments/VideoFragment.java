package com.hardteam.rg.soundcheckstudio.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hardteam.rg.soundcheckstudio.R;

/**
 * Created by rg on 3/22/16.
 */
public class VideoFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View videoView = inflater.inflate(R.layout.video_fragment, container, false);
        getActivity().setTitle("Видео");
        return videoView;
    }
}
