package com.maxalva.tareavirtual1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by max on 30/09/17.
 */

public class DestinosAdapter extends ArrayAdapter<Destino> {
    private Destino[] destinos;

    public DestinosAdapter(Context context, Destino[] destinos){
        super(context, R.layout.item_destinos, destinos);

        this.destinos = destinos;
    }

    @NonNull
    @Override
    public View getView(int i, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.item_destinos, null);

        TextView opcion = view.findViewById(R.id.opcion);

        opcion.setText(this.destinos[i].getDestino());

        return view;
    }


    @Override
    public View getDropDownView(int i, @Nullable View convertView, @NonNull ViewGroup parent) {
       LayoutInflater inflater = LayoutInflater.from(getContext());
       View view = inflater.inflate(R.layout.item_destinos, null);

       TextView opcion = view.findViewById(R.id.opcion);

       opcion.setText(this.destinos[i].getDestino());

       return view;
    }

}
