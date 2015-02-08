package com.lazaro.david.mvpexample;

import android.app.Application;

import com.lazaro.david.mvpexample.ui.activity.MainActivity;
import com.lazaro.david.mvpexample.di.Dagger_RootComponent;
import com.lazaro.david.mvpexample.di.MainModule;
import com.lazaro.david.mvpexample.di.RootComponent;

/**
 * Created by david on 3/2/15.
 */
public class MVPApplication extends Application {

    private RootComponent component;

    @Override
    public void onCreate() {

        super.onCreate();

        initializeDependencyInjector();
    }

    private void initializeDependencyInjector() {

        component = Dagger_RootComponent.builder().mainModule(new MainModule(this)).build();
        component.inject(this);
    }


    public void inject(MainActivity activity){

        component.inject(activity);
    }

    public RootComponent getComponent(){
        return component;
    }

}

