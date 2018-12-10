package com.udacity.gradle.builditbigger.backend;
import com.example.keepsmiling.Smile;
/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;
    private Smile smile;

    public MyBean() {
        smile=new Smile();
    }

    public String getJoke() {
        return smile.getJoke();
    }


}