package com.lazaro.david.mvpexample.ui.presenter;

import com.lazaro.david.mvpexample.ui.view.MainView;

/**
 * Created by david on 4/2/15.
 */
public interface MainPresenter {

    void onWelcomeButtonPressed();

    void setView(MainView view);
}
