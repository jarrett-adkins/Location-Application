package com.example.admin.locationapplication.view.mainActivity;

import com.example.admin.locationapplication.data.DatabaseHelper;

public class MainActivityPresenter implements MainActivityContract.Presenter{

    MainActivityContract.View view;
    DatabaseHelper databaseHelper;

    public MainActivityPresenter(DatabaseHelper databaseHelper) {
        this.databaseHelper = databaseHelper;
    }

    @Override
    public void attachView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void detach() {
        view = null;
    }

    @Override
    public void getLocation() {
        databaseHelper.saveData( "current location" );
        view.updateLocation();
    }
}
