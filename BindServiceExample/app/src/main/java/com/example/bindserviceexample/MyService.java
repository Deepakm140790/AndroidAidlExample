package com.example.bindserviceexample;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends Service {
    private final String TAG = "MyService";
    private final IBinder mIBinder = new MyBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind");
        return mIBinder;
    }

    public String getName(){
        // Right your implementation here.
        return "Your name";
    }

    public class MyBinder extends Binder {
        MyService getService(){
            return MyService.this;
        }
    }
}