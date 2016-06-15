package com.hardteam.rg.soundcheckstudio.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.hardteam.rg.soundcheckstudio.R;

/**
 * Created by rg on 3/22/16.
 */
public class ContactsFragment extends Fragment implements OnMapReadyCallback {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contactsView = inflater.inflate(R.layout.contacts_fragment, container, false);
        getActivity().setTitle("Контакты");
        return contactsView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //SupportMapFragment mapFragment = (SupportMapFragment)getActivity().getSupportFragmentManager().findFragmentById(R.id.map);
        SupportMapFragment mapFragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        LatLng marker = new LatLng(45.022171,38.98648);
        googleMap.setTrafficEnabled(true);
//        googleMap.animateCamera(CameraUpdateFactory.zoomTo(16));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker, 16));
        googleMap.addMarker(new MarkerOptions().title("Soundcheck - ул. Суворова 60/1").position(marker).snippet("Тел: +7(906)4364115"));


    }
}
