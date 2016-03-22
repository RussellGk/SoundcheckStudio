package com.hardteam.rg.soundcheckstudio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rg on 3/22/16.
 */
public class EquipmentAdapter extends ArrayAdapter<Equipment> {
    List<Equipment> equipmentList;
    public EquipmentAdapter(Context context, List<Equipment> equipmentList) {
        super(context, 0, equipmentList);
        this.equipmentList = equipmentList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Equipment equipment = getItem(position);
        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        TextView nameEquipment = (TextView)convertView.findViewById(R.id.name_equipment);
        TextView categoryEquipment = (TextView)convertView.findViewById(R.id.cat_equipment);

        nameEquipment.setText(equipment.nameEquipment);
        categoryEquipment.setText(equipment.categoryEquipment);

        return convertView;
    }
}
