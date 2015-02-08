package com.lazaro.david.mvpexample.di;

import com.lazaro.david.mvpexample.MVPApplication;
import com.lazaro.david.mvpexample.di.MainModule;
import com.lazaro.david.mvpexample.ui.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by david on 5/2/15.
 */
@Singleton
@Component(modules = MainModule.class)
public interface RootComponent {

    void inject(MainActivity activity);
    void inject(MVPApplication application);
}
