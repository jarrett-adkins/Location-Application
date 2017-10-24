package com.example.admin.locationapplication;

public interface BasePresenter<V extends  BaseView> {

    void attachView( V view );
    void detach();
}
