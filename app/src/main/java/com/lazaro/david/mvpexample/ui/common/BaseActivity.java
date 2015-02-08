package com.lazaro.david.mvpexample.ui.common;

import android.app.Activity;

import butterknife.ButterKnife;

/**
 * Created by david on 3/2/15.
 */
public abstract class BaseActivity extends Activity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.reset(this);
    }
}
