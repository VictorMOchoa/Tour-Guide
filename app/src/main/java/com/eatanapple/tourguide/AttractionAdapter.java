package com.eatanapple.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AttractionAdapter extends RecyclerView.Adapter<AttractionAdapter.AttractionViewHolder> {

    public List<Attraction> attractions;
    private Context context;

    public AttractionAdapter(Context context, List<Attraction> attractions) {
        this.context = context;
        this.attractions = attractions;
    }

    public class AttractionViewHolder extends RecyclerView.ViewHolder  {

        // Setup the resources for each city here..

        public AttractionViewHolder(View view) {
            super(view);

        }
    }


    @Override
    public AttractionViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.attraction_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new AttractionViewHolder(view);
    }


    @Override
    public void onBindViewHolder(AttractionViewHolder holder, int position) {
        // Set the views with holder.prop
    }


    @Override
    public int getItemCount() {
        return attractions.size();
    }

}