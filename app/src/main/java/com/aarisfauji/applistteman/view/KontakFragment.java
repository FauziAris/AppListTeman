package com.aarisfauji.applistteman.view;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.aarisfauji.applistteman.R;
import com.aarisfauji.applistteman.presenter.MainKontakFragmentPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class KontakFragment extends Fragment implements KontakView{

    View myView;
    private MainKontakFragmentPresenter presenter;
    public KontakFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_kontak, container, false);
        presenter = new MainKontakFragmentPresenter(this);
        final EditText txtIG = (EditText)  myView.findViewById(R.id.editTextIG);
        final EditText txtTlp = (EditText)  myView.findViewById(R.id.editTextTelepon);
        Button btnIG = (Button) myView.findViewById(R.id.btn_instagram);
        Button btntlp = (Button) myView.findViewById(R.id.btn_tlp);
        btnIG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.followIG(txtIG.getText().toString());
            }
        });

        btntlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.panggilNoTelepon(txtTlp.getText().toString());
            }
        });
        return myView;
    }

    @Override
    public void bukaWeb(String url) {
        Intent bukaWeb = new Intent(Intent.ACTION_VIEW);
        bukaWeb.setData(Uri.parse(url));
        startActivity(bukaWeb);
    }

    @Override
    public void hubungiNoTlp(String no) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse(no));
        startActivity(callIntent);
    }
}
