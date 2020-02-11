package com.r4hu1.fridaplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class HookMeInteger extends AppCompatActivity {

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hook_me_integer);
        checker(integerFromJNI());



    }

    public void checker(int i) {
        if(i == 21) {
            Log.d("flag", stringFromJNI());
        }
        else{
            Toast.makeText(this, "Internally The Integer checker failed!",Toast.LENGTH_LONG).show();

        }
    }

    public native String stringFromJNI();

    public native int integerFromJNI();

}
