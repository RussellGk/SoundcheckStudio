package com.hardteam.rg.soundcheckstudio.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hardteam.rg.soundcheckstudio.MainInfo;
import com.hardteam.rg.soundcheckstudio.R;
import com.hardteam.rg.soundcheckstudio.adapters.SoundcheckAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rg on 3/22/16.
 */
public class SoundcheckFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View soundcheckView = inflater.inflate(R.layout.soundcheck_fragment, container, false);

        RecyclerView soundcheckRecyclerView = (RecyclerView) soundcheckView.findViewById(R.id.sound_recycler);
        List<MainInfo>  mainInfoData= getMainInfoList();
        SoundcheckAdapter soundcheckAdapter = new SoundcheckAdapter(mainInfoData);
        soundcheckRecyclerView.setAdapter(soundcheckAdapter);

        //How to show the RecyclerView
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        soundcheckRecyclerView.setLayoutManager(linearLayoutManager);

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

    private List<MainInfo> getMainInfoList()
    {
        List<MainInfo> data = new ArrayList<>();
        data.add(new MainInfo("Репетиционная база SoundСheck","Мы предлагаем Вам уютную обстановку, качественный звук и хорошую акустику. Приходите, творите и развивайтесь!"));
        data.add(new MainInfo("Репетиционная комната 20 кв.м.","Профессиональое оборудование, качественная звукоизоляция, комната отдыха, отдельная прихожая, помещение для хранения вашего оборудования, санузел."));
        data.add(new MainInfo("Стоимость аренды в Будни и Выходые","09:00 - 23:00 — 200 руб. час"));
        data.add(new MainInfo("Аренда дополнительного оборудования","Тарелки для барабанов — 100 руб. репетиция"));
        data.add(new MainInfo("Адрес: ул. Суворова 60/1","Пересечение ул. Суворова / ул. Салтыкова Щедрина"));
        data.add(new MainInfo("Контакты", "+7 (906) 43-64-115"));
        return data;
    }
}
