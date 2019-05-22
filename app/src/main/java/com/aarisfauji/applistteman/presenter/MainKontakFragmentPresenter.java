package com.aarisfauji.applistteman.presenter;

import android.content.Intent;
import android.net.Uri;

import com.aarisfauji.applistteman.view.KontakView;

public class MainKontakFragmentPresenter implements  MainKontak {

    private KontakView kontakView;
    public MainKontakFragmentPresenter() {
    }

    public MainKontakFragmentPresenter(KontakView kontakView) {
        this.kontakView=kontakView;
    }


    @Override
    public void panggilNoTelepon(String no) {
        kontakView.hubungiNoTlp("tel:"+no);
    }

    @Override
    public void followIG(String username) {
        String url = "https://www.instagram.com/"+ username;
        kontakView.bukaWeb(url);
    }
}
