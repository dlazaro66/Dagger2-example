package com.lazaro.david.mvpexample.ui.presenter;

import com.lazaro.david.mvpexample.ui.view.MainView;

import javax.inject.Inject;

/**
 * Created by david on 4/2/15.
 */
public class MainPresenterImpl implements MainPresenter {

    private MainView view;

    @Inject
    public MainPresenterImpl() {

    }

    @Override
    public void onWelcomeButtonPressed() {
        view.showWelcomeText("Hello Dagger 2!");
        view.showToast("Hello MVP!");
    }

    @Override
    public void setView(MainView view) {
        this.view = view;
    }

}
