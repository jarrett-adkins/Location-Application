package com.example.admin.locationapplication.di;

import com.example.admin.locationapplication.view.mainActivity.MainActivity;

import dagger.Component;

@Component( modules = MainModule.class )
public interface MainComponent {

    void inject(MainActivity mainActivity );
}
