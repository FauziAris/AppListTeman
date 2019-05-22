package com.aarisfauji.applistteman.presenter;

import com.aarisfauji.applistteman.model.Teman;
import com.aarisfauji.applistteman.view.DaftarTemanView;

import java.util.ArrayList;
import java.util.List;

public class MainTemanPresenter implements  MainTeman {

    private DaftarTemanView daftarTemanView;
   // private Teman teman = new Teman();
    private  List<Teman> listTeman;

    public MainTemanPresenter(DaftarTemanView daftarTemanView) {
        this.daftarTemanView = daftarTemanView;
    }

    public MainTemanPresenter() {
    }

    @Override
    public List<Teman> dataDummy() {
        this.listTeman=new ArrayList<Teman>();
       Teman teman = new Teman();
        teman.setNim("10116589");
        teman.setNama("Yusup Maulana");
        teman.setKelas("IF-13");
        teman.setTelepon("085351541901");
        teman.setEmail("yusupmaulanaibrohim@gail.com");
        teman.setInstagram("Ibrohima05");
        listTeman.add(teman);
        Teman teman2 = new Teman();
        teman2.setNim("1011651");
        teman2.setNama("Iyad");
        teman2.setKelas("If-13");
        teman2.setTelepon("089663591954");
        teman2.setEmail("-");
        teman2.setInstagram("-");
        listTeman.add(teman2);
        return listTeman;
    }

}
