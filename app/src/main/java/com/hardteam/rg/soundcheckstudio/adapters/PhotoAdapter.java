package com.hardteam.rg.soundcheckstudio.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hardteam.rg.soundcheckstudio.R;
import com.hardteam.rg.soundcheckstudio.utils.ImageDownloader;

import java.util.List;

/**
 * Created by rg on 6/4/16.
 */
public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.PhotoHolder> {

    private List<String> photos;
    private ImageDownloader imageDownloader;

    public PhotoAdapter(Context context, List<String> photos)
    {
        this.photos = photos;
        imageDownloader = new ImageDownloader(context);
    }


    @Override
    public PhotoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_item,parent,false);
        return new PhotoHolder(view);
    }

    @Override
    public void onBindViewHolder(PhotoHolder holder, int position) {
        String imgUrl = photos.get(position);
        imageDownloader.loadWithGlide(imgUrl,holder.photo);

    }

    @Override
    public int getItemCount() {
        return photos.size();
    }

    public class PhotoHolder extends RecyclerView.ViewHolder {

        protected ImageView photo;

        public PhotoHolder(View itemView) {
            super(itemView);
            photo = (ImageView) itemView.findViewById(R.id.photo_item);
        }
    }
}
