package com.example.admin.locationapplication.view.mainActivity;

import com.example.admin.locationapplication.BasePresenter;
import com.example.admin.locationapplication.BaseView;

public interface MainActivityContract {

    interface View extends BaseView {
        void updateLocation();
    }

    interface Presenter extends BasePresenter<View> {
        void getLocation();
    }
}
