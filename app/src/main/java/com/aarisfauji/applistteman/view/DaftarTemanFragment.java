package com.aarisfauji.applistteman.view;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.aarisfauji.applistteman.R;
import com.aarisfauji.applistteman.adapter.TemanAdapter;
import com.aarisfauji.applistteman.model.Teman;
import com.aarisfauji.applistteman.presenter.MainTemanPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DaftarTemanFragment extends Fragment implements DaftarTemanView{
//    tanggal pengerjaan     : 21 Mei 2019
//    nim                    : 10116563
//    nama                   : A Aris Fauji
//    kelas                  : AKB-13 (IF-13)
    View view;
    List<Teman> listTeman;
    MainTemanPresenter presenter;
    public DaftarTemanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_daftar_teman, container, false);

        presenter = new MainTemanPresenter(this);
        listTeman = presenter.dataDummy();
        ListView listView=(ListView) view.findViewById(R.id.list_item);


        listView.setAdapter(new TemanAdapter(getActivity(),R.layout.fragment_list_teman,listTeman));
//        FloatingActionButton fab = view.findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentTransaction fr = getFragmentManager().beginTransaction();
//                fr.replace(R.id.content_frame, new ListTemanFragment());
//                fr.commit();
//            }
//        });
        return view;
    }


}
