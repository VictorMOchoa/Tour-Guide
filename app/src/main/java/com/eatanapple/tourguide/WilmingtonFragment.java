package com.eatanapple.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class WilmingtonFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wilmington, container, false);

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
        Attraction fosterFreeze = new Attraction(getResources().getString(R.string.foster_freeze_name),
                getResources().getString(R.string.foster_freeze_hours),
                getResources().getString(R.string.foster_freeze_address),
                R.drawable.foster_freeze);
        Attraction banningHome = new Attraction(getResources().getString(R.string.banning_home_name),
                getResources().getString(R.string.banning_home_hours),
                getResources().getString(R.string.banning_home_address),
                R.drawable.banning_home);
        Attraction leosTacos = new Attraction(getResources().getString(R.string.leos_tacos_name),
                getResources().getString(R.string.leos_tacos_hours),
                getResources().getString(R.string.leos_tacos_address),
                R.drawable.leos_tacos);
        Attraction harborCollege = new Attraction(getResources().getString(R.string.in_n_out_name),
                getResources().getString(R.string.in_n_out_hours),
                getResources().getString(R.string.in_n_out_address),
                R.drawable.harbor_college);
        attractions.add(fosterFreeze);
        attractions.add(banningHome);
        attractions.add(leosTacos);
        attractions.add(harborCollege);
        return attractions;
    }

}
