package com.example.easyd.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();

        Log.i("i", "data1 : " + intent.getStringExtra("param1"));
        Log.i("i", "data2 : " + intent.getStringExtra("param2"));
    }


    public static void actionStart(Context context, String data1, String data2){
        Intent intent = new Intent(context, ThirdActivity.class);
        intent.putExtra("param1", data1);
        intent.putExtra("param2", data2);
        context.startActivity(intent);
        Log.i("i", "actionStart 被调用");
    }
}
