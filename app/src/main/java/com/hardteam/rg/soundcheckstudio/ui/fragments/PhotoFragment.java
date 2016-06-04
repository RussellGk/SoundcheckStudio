package com.hardteam.rg.soundcheckstudio.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hardteam.rg.soundcheckstudio.R;
import com.hardteam.rg.soundcheckstudio.adapters.PhotoAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rg on 3/22/16.
 */
public class PhotoFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View photoView = inflater.inflate(R.layout.photo_fragment, container, false);

        RecyclerView photoRecyclerView = (RecyclerView) photoView.findViewById(R.id.photo_recycler);
        List<String> photoList = getPhotoList();
        PhotoAdapter photoAdapter = new PhotoAdapter(getContext(),photoList);
        photoRecyclerView.setAdapter(photoAdapter);

        //How to show the RecyclerView
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        photoRecyclerView.setLayoutManager(linearLayoutManager);


        getActivity().setTitle("Фото");
        return photoView;
    }

    private List<String> getPhotoList() {

        List<String> list = new ArrayList<>();
        list.add("http://cs409820.vk.me/v409820333/78b0/sqWCbrYN5hY.jpg");
        list.add("http://cs409820.vk.me/v409820333/77de/8vkP2sqSx9M.jpg");
        list.add("http://cs409820.vk.me/v409820333/77e8/UUO88-p1esw.jpg");
        list.add("http://cs409820.vk.me/v409820333/7806/b_krq4cz3PM.jpg");
        list.add("http://cs409820.vk.me/v409820333/77fc/6Fyrfr23umk.jpg");
        list.add("http://cs409820.vk.me/v409820333/7810/HkjOV84ljRY.jpg");
        list.add("http://cs409820.vk.me/v409820333/7824/y1YSoMpPjqI.jpg");
        return list;
    }
}
