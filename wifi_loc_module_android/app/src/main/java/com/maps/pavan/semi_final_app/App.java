package com.maps.pavan.semi_final_app;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("****************************")
                // if desired
                .clientKey("********************************")
                .server("***********************************")
                .build()
        );
    }


}