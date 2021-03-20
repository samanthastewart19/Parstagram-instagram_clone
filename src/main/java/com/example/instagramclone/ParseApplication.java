package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Registers parse model
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("3MWkIR0ViNeO55mgzwlNtNJE1YbUdvAseTshfY1X")
                .clientKey("rpURPti7O1bAyAaMSQayew0XzEZ65Lqq6lR9iqKl")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

