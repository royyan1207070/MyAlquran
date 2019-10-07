package com.al.myalquran.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.al.myalquran.R;
import com.al.myalquran.modal.Modal;

import java.util.ArrayList;

public class AdapterHome extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<Modal>modals;

    public AdapterHome(Context context, ArrayList<Modal> modals) {
        this.context = context;
        this.modals = modals;
    }

    class MyAdapter extends RecyclerView.ViewHolder {
        TextView asma, arti, nama, nomor;
        public MyAdapter(@NonNull View itemView) {
            super(itemView);
            asma = itemView.findViewById(R.id.asma);
            nama = itemView.findViewById(R.id.name);
            arti = itemView.findViewById(R.id.arti);
            nomor = itemView.findViewById(R.id.nomor);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view  = LayoutInflater.from(context).inflate(R.layout.adapter_home,  viewGroup, false);

        return new MyAdapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((MyAdapter)viewHolder).nomor.setText(modals.get(i).getNomor());
        ((MyAdapter)viewHolder).nama.setText(modals.get(i).getNama());
        ((MyAdapter)viewHolder).asma.setText(modals.get(i).getAsma());
        ((MyAdapter)viewHolder).arti.setText(modals.get(i).getArti());
    }

    @Override
    public int getItemCount() {
        return modals.size();
    }
}
