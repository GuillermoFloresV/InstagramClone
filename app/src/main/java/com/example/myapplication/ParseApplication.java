package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate()
    {
        super.onCreate();

        //register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("guillermo-parstagram") // should correspond to APP_ID env variable
                .clientKey("CodepathInstagramClone")  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://guillermo-parstagram.herokuapp.com/parse").build());
    }
}
