package com.eatanapple.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class TorranceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_torrance, container, false);
        List<Attraction> attractions = setupAttractionsList();

        RecyclerView recyclerView = view.findViewById(R.id.attractions_rv);

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private List<Attraction> setupAttractionsList() {
        List<Attraction> attractions = new ArrayList<>();
        Attraction delAmo = new Attraction(getResources().getString(R.string.del_amo_name),
                getResources().getString(R.string.del_amo_hours),
                getResources().getString(R.string.del_amo_address),
                R.drawable.del_amo);
        Attraction wilsonPark = new Attraction(getResources().getString(R.string.wilson_park_name),
                getResources().getString(R.string.wilson_park_hours),
                getResources().getString(R.string.wilson_park_address),
                R.drawable.wilson_park);
        Attraction torranceBeach = new Attraction(getResources().getString(R.string.torrance_beach_name),
                getResources().getString(R.string.torrance_beach_hours),
                getResources().getString(R.string.torrance_beach_address),
                R.drawable.torrance_beach);
        Attraction inNOut = new Attraction(getResources().getString(R.string.in_n_out_name),
                getResources().getString(R.string.in_n_out_hours),
                getResources().getString(R.string.in_n_out_address),
                R.drawable.innout);
        attractions.add(delAmo);
        attractions.add(wilsonPark);
        attractions.add(torranceBeach);
        attractions.add(inNOut);
        return attractions;
    }
}