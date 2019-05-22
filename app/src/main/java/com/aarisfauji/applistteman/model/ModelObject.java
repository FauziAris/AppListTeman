package com.aarisfauji.applistteman.model;

import com.aarisfauji.applistteman.R;

public enum ModelObject {
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
