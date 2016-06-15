package com.hardteam.rg.soundcheckstudio.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by rg on 6/15/16.
 */
public class NetworkStatusChecker
{

    //Returns true if the network is available
    public static boolean isNetworkAvailable(Context context)
    {
        ConnectivityManager cm = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }
}
