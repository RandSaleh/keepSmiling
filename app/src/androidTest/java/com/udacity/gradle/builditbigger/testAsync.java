package com.udacity.gradle.builditbigger;


import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.test.ApplicationTestCase;
import android.util.Pair;

import java.util.concurrent.ExecutionException;

public class testAsync extends ApplicationTestCase<Application> {

    public testAsync() {
        super(Application.class);
    }

    public void testGetJokeTask() throws ExecutionException, InterruptedException {
       String result =  new SmileAsyncTask().execute(new Pair<Context, String>(getContext(), "Manfred")).get();
        assertNotNull(result);
    }
}