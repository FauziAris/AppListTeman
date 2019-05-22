package com.aarisfauji.applistteman.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
//    tanggal pengerjaan     : 21 Mei 2019
//    nim                    : 10116563
//    nama                   : A Aris Fauji
//    kelas                  : AKB-13 (IF-13)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // langsung pindah ke MainActivity atau activity lain
        // begitu memasuki splash screen ini
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
