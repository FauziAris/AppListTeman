package com.aarisfauji.applistteman.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.aarisfauji.applistteman.model.Teman;
import com.aarisfauji.applistteman.R;

import java.util.List;

public class TemanAdapter extends ArrayAdapter<Teman> {

    //    tanggal pengerjaan     : 21 Mei 2019
//    nim                    : 10116563
//    nama                   : A Aris Fauji
//    kelas                  : AKB-13 (IF-13)
    List<Teman> listTeman;
    Context context;
    int layout;

    public TemanAdapter(Context context, int layout, List<Teman> listTeman) {
        super(context, layout,listTeman);
        this.listTeman = listTeman;
        this.context = context;
        this.layout = layout;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        TemanHolder holder;
        if(v==null){
            LayoutInflater vi=((Activity)context).getLayoutInflater();
            v=vi.inflate(layout, parent,false);

            holder=new TemanHolder();
            holder.namaView=(TextView) v.findViewById(R.id.nama);
            holder.nimView=(TextView) v.findViewById(R.id.nim);
            holder.kelasView=(TextView) v.findViewById(R.id.kelas);
            holder.teleponView=(TextView) v.findViewById(R.id.telepon);
            holder.emailView= (TextView) v.findViewById(R.id.email);
            holder.igView= (TextView) v.findViewById(R.id.ig);


            v.setTag(holder);
        }
        else{
            holder=(TemanHolder) v.getTag();
        }

        Teman teman=listTeman.get(position);
        holder.namaView.setText("Nama : "+teman.getNama());
        holder.nimView.setText("NIM : "+teman.getNim());
        holder.kelasView.setText("Kelas : "+teman.getKelas());
        holder.teleponView.setText("Telepon : "+teman.getTelepon());
        holder.emailView.setText("Email : "+teman.getEmail());
        holder.igView.setText("Instagram : "+teman.getInstagram());

        return v;
    }

    static class TemanHolder{
        TextView nimView;
        TextView namaView;
        TextView kelasView;
        TextView teleponView;
        TextView emailView;
        TextView igView;
    }
}
