package com.lazaro.david.mvpexample.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.lazaro.david.mvpexample.MVPApplication;
import com.lazaro.david.mvpexample.R;
import com.lazaro.david.mvpexample.ui.presenter.MainPresenter;
import com.lazaro.david.mvpexample.ui.common.BaseActivity;
import com.lazaro.david.mvpexample.ui.view.MainView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends BaseActivity implements MainView {

    @InjectView(R.id.welcomeTextView)
    TextView welcomeTV;

    @Inject
    MainPresenter presenter;

    @Inject
    Context appContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ((MVPApplication)getApplication()).getComponent().inject(this);
        ButterKnife.inject(this);
        presenter.setView(this);

    }

    @OnClick(R.id.welcomeButton)
    public void welcomeClickPressed(){

        presenter.onWelcomeButtonPressed();
    }

    @Override
    public void showWelcomeText(String text) {

        welcomeTV.setText(text);
    }

    @Override
    public void showToast(String text) {

        Toast.makeText(appContext,text,Toast.LENGTH_SHORT).show();
    }
}
