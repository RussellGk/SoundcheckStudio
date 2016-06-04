package com.hardteam.rg.soundcheckstudio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hardteam.rg.soundcheckstudio.Equipment;
import com.hardteam.rg.soundcheckstudio.R;

import java.util.List;

/**
 * Created by rg on 3/22/16.
 */
public class EquipmentAdapter extends RecyclerView.Adapter<EquipmentAdapter.CardViewHolder> {
    List<Equipment> equipmentList;

    public EquipmentAdapter(List<Equipment> equipmentList)
    {
        this.equipmentList = equipmentList;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new CardViewHolder(convertView);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        Equipment equipment = equipmentList.get(position);
        holder.nameEquipment.setText(equipment.nameEquipment);
        holder.categoryEquipment.setText(equipment.categoryEquipment);
    }

    @Override
    public int getItemCount() {
        return equipmentList.size();
    }
//    public EquipmentAdapter(Context context, List<Equipment> equipmentList) {
//        super(context, 0, equipmentList);
//        this.equipmentList = equipmentList;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        Equipment equipment = getItem(position);
//        if(convertView == null)
//        {
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
//        }
//        TextView nameEquipment = (TextView)convertView.findViewById(R.id.name_equipment);
//        TextView categoryEquipment = (TextView)convertView.findViewById(R.id.cat_equipment);
//
//        nameEquipment.setText(equipment.nameEquipment);
//        categoryEquipment.setText(equipment.categoryEquipment);
//
//        return convertView;
//    }

    public class CardViewHolder extends RecyclerView.ViewHolder{
        protected TextView nameEquipment;
        protected TextView categoryEquipment;
        public CardViewHolder(View convertView)
        {
            super(convertView);
            nameEquipment = (TextView)convertView.findViewById(R.id.name_equipment);
            categoryEquipment = (TextView)convertView.findViewById(R.id.cat_equipment);


        }

    }
}
