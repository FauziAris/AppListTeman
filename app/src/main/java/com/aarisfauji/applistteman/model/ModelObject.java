package com.aarisfauji.applistteman.model;

import com.aarisfauji.applistteman.R;

public enum ModelObject {

    //    tanggal pengerjaan     : 21 Mei 2019
//    nim                    : 10116563
//    nama                   : A Aris Fauji
//    kelas                  : AKB-13 (IF-13)
    HAL_1(R.string.halaman1, R.layout.view_1),
    HAL_2(R.string.halaman2, R.layout.view_2),
    HAL_3(R.string.halaman3, R.layout.view_3);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
