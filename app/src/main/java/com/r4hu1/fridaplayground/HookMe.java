package com.r4hu1.fridaplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class HookMe extends AppCompatActivity {


    static {
        System.loadLibrary("native-lib");
    }

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hook_me);
    }

    public void printFlag() {

        Log.d("flag", stringFromJNI());

    }

    public native String stringFromJNI();
}


