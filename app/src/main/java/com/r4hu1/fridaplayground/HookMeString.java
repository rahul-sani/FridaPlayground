package com.r4hu1.fridaplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class HookMeString extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hook_me_string);

        checker(stringargs());

    }

    public void checker(String args) {

        if(args.equals("Hail Frida!")) {
            Log.d("flag", stringFromJNI());
        }
        else{
            Toast.makeText(this, "Internally the String checker failed!",Toast.LENGTH_LONG).show();

        }

    }

    public native String stringFromJNI();

    public  native  String stringargs();


}
