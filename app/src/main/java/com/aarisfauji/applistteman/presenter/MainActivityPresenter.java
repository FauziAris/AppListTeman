package com.aarisfauji.applistteman.presenter;
import com.aarisfauji.applistteman.view.DaftarTemanFragment;
import com.aarisfauji.applistteman.view.HomeFragment;
import com.aarisfauji.applistteman.view.KontakFragment;
import com.aarisfauji.applistteman.view.MainView;
import com.aarisfauji.applistteman.view.ProfilFragment;

public class MainActivityPresenter implements MainPresenter {

    private  MainView mainView;
    public MainActivityPresenter() {
    }

    public MainActivityPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void loadFragmentHome() {
        mainView.setFragment(new HomeFragment());
    }

    @Override
    public void loadFragmentProfil() {
        mainView.setFragment(new ProfilFragment());
    }

    @Override
    public void loadFragmentKontak() {
        mainView.setFragment(new KontakFragment());
    }

    @Override
    public void loadFragmentTeman() {
        mainView.setFragment(new DaftarTemanFragment());
    }
}
