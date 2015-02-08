package com.lazaro.david.mvpexample.di;

import android.content.Context;

import com.lazaro.david.mvpexample.MVPApplication;
import com.lazaro.david.mvpexample.ui.presenter.MainPresenter;
import com.lazaro.david.mvpexample.ui.presenter.MainPresenterImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by david on 5/2/15.
 */
@Module
public class MainModule {

    private final MVPApplication application;

    public MainModule(MVPApplication application) {
        this.application = application;
    }

    @Provides
    MainPresenter provideMainPresenter() {
        return new MainPresenterImpl();
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return application;
    }
}
