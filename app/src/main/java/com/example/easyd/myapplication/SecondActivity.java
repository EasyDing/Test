package com.example.easyd.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn1 = (Button) findViewById(R.id.button_1);
         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 ThirdActivity.actionStart(SecondActivity.this, "data1", "data2");
             }
         });
    }
}
