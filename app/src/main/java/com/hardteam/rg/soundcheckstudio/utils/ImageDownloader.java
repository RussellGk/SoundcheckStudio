package com.hardteam.rg.soundcheckstudio.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.hardteam.rg.soundcheckstudio.R;

/**
 * Created by rg on 6/4/16.
 */
public class ImageDownloader {

    private Context context;

    public ImageDownloader(Context context)
    {
        this.context = context;
    }

    public void loadWithGlide(String imgUrl, ImageView target)
    {
        Glide.with(context)
                .load(imgUrl)
                .override(800,600)
                .crossFade()
                .fitCenter()
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.mipmap.ic_photo_library_black_18dp)
                .into(target);
    }

    public void clearGlideCache()
    {
        Glide.get(context).clearMemory();
    }
}
