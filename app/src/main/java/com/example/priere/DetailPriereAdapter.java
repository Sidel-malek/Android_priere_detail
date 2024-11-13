package com.example.priere;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DetailPriereAdapter extends ArrayAdapter<DetailPriere> {
    List<DetailPriere> es;
    public DetailPriereAdapter(Context context, List<DetailPriere> detailPriere) {
        super(context, R.layout.item, detailPriere);
        es= detailPriere;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.item,parent, false);

        ImageView icon = (ImageView) convertView.findViewById(R.id.img);

        icon.setImageResource(es.get(position).getIdImage());
        return convertView;
    }

}
