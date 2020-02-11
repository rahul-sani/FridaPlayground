package com.r4hu1.fridaplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class OverloadedFunc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overloaded_func);

        getFlag(10);
        getFlag(stringargs());




    }

    public void getFlag(int i) {
            i++;
    }

    public void getFlag(String str) {
        if(str.equals("Feels Godly with Frida")) {
            Log.d("flag", stringFromJNI());
        }
        else {
            Toast.makeText(this, "Flag could not be generated!",Toast.LENGTH_LONG).show();

        }
    }

    public native String stringargs();
    public native String stringFromJNI();
}
