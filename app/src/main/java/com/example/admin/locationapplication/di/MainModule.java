package com.example.admin.locationapplication.di;

import com.example.admin.locationapplication.data.DatabaseHelper;
import com.example.admin.locationapplication.view.mainActivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    DatabaseHelper databaseHelper;

    public MainModule( DatabaseHelper databaseHelper ) {
        this.databaseHelper = databaseHelper;
    }

    @Provides
    MainActivityPresenter providesMainActivityPresenter() {
        return new MainActivityPresenter( databaseHelper );
    }
}
