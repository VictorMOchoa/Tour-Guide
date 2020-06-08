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


public class SanPedroFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_san_pedro, container, false);

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
        Attraction pointFermin = new Attraction(getResources().getString(R.string.point_fermin_name),
                getResources().getString(R.string.point_fermin_hours),
                getResources().getString(R.string.point_fermin_address),
                R.drawable.point_fermin);
        Attraction koreanFriendshipBell = new Attraction(getResources().getString(R.string.korean_bell_name),
                getResources().getString(R.string.korean_bell_hours),
                getResources().getString(R.string.korean_bell_address),
                R.drawable.korean_bell);
        Attraction busyBees = new Attraction(getResources().getString(R.string.busy_bee_name),
                getResources().getString(R.string.busy_bee_hours),
                getResources().getString(R.string.busy_bee_address),
                R.drawable.busy_bee);
        Attraction vincentThomasBridge = new Attraction(getResources().getString(R.string.vincent_thomas_name),
                getResources().getString(R.string.vincent_thomas_hours),
                getResources().getString(R.string.vincent_thomas_address),
                R.drawable.vincent_thomas);
        attractions.add(pointFermin);
        attractions.add(koreanFriendshipBell);
        attractions.add(busyBees);
        attractions.add(vincentThomasBridge);
        return attractions;
    }

}