package com.hardteam.rg.soundcheckstudio.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hardteam.rg.soundcheckstudio.MainInfo;
import com.hardteam.rg.soundcheckstudio.R;

import java.util.List;

/**
 * Created by rg on 6/2/16.
 */
public class SoundcheckAdapter extends RecyclerView.Adapter<SoundcheckAdapter.CardViewHolder>{
    List<MainInfo> infoList;

    public SoundcheckAdapter(List<MainInfo> infoList)
    {
        this.infoList = infoList;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View infoView = LayoutInflater.from(parent.getContext()).inflate(R.layout.soundcheck_item,parent,false);
        return new CardViewHolder(infoView);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        MainInfo mI = infoList.get(position);
        holder.generalInfo.setText(mI.generalInfo);
        holder.mainInfo.setText(mI.mainInfo);

    }

    @Override
    public int getItemCount() {
        return infoList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{

        protected TextView generalInfo;
        protected TextView mainInfo;

        public CardViewHolder(View infoView) {
            super(infoView);
            generalInfo = (TextView) infoView.findViewById(R.id.general_info);
            mainInfo = (TextView) infoView.findViewById(R.id.main_info);
        }
    }
}
