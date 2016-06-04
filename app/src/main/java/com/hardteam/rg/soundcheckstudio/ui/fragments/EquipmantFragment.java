package com.hardteam.rg.soundcheckstudio.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hardteam.rg.soundcheckstudio.Equipment;
import com.hardteam.rg.soundcheckstudio.adapters.EquipmentAdapter;
import com.hardteam.rg.soundcheckstudio.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rg on 3/22/16.
 */
public class EquipmantFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View equipmentView = inflater.inflate(R.layout.equipment_fragment,container,false);
        RecyclerView equipmentRecyclerView = (RecyclerView)equipmentView.findViewById(R.id.context_recyclerview);
        List<Equipment> adapterData = getDataList();
        EquipmentAdapter equipmentAdapter = new EquipmentAdapter(adapterData);
        equipmentRecyclerView.setAdapter(equipmentAdapter);

        //How to show the RecyclerView
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        equipmentRecyclerView.setLayoutManager(linearLayoutManager);

//        FloatingActionButton floatingActionButton = (FloatingActionButton) equipmentView.findViewById(R.id.fab);
//        floatingActionButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(equipmentView,"Form for sending the letter", Snackbar.LENGTH_SHORT).show();
//
//            }
//        });

        getActivity().setTitle("Оборудование");
        return equipmentView;
    }

    private List<Equipment> getDataList()
    {
        List<Equipment> data = new ArrayList<>();
//        data.add(new Equipment("Ударная установка ТАМА IMPERIALSTAR","Барабанная секция"));
//        data.add(new Equipment("Комплект тарелок Meinl MCS Bronze 14/16/20","Барабанная секция"));
//        data.add(new Equipment("Гитарный комбоусилитель PEAVEY Bandit 112","Гитарная секция"));
//        data.add(new Equipment("Гитарный комбоусилитель HIWATT G100R","Гитарная секция"));
//        data.add(new Equipment("Бас гитарный комбоусилитель KUSTOM KXB100","Гитарная секция"));
//        data.add(new Equipment("Две пассивных акустических системы по 300 Вт","Вокальная секция"));
//        data.add(new Equipment("Усилитель Alto","Вокальная секция"));
//        data.add(new Equipment("Микшерный пульт Soundcraft","Вокальная секция"));
//        data.add(new Equipment("Микрофоны SHURE","Вокальная секция"));
        data.add(new Equipment("ТАМА IMPERIALSTAR","Барабанная секция"));
        data.add(new Equipment("Meinl MCS Bronze 14/16/20","Барабанная секция"));
        data.add(new Equipment("Комбо KUSTOM KXB100","Бас гитарная секция"));
        data.add(new Equipment("Комбо PEAVEY Bandit 112","Гитарная секция"));
        data.add(new Equipment("Комбо HIWATT G100R","Гитарная секция"));
        data.add(new Equipment("2x300Вт пассивная акустика", "Вокальная секция"));
        data.add(new Equipment("Усилитель Alto","Вокальная секция"));
        data.add(new Equipment("Микшерный пульт Soundcraft","Вокальная секция"));
        data.add(new Equipment("Микрофоны SHURE","Вокальная секция"));
        return data;
    }
}
