package com.example.work2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.Calendar;

public class resultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent=getIntent();
        intent.putExtra("data","哈哈哈哈哈哈哈哈");
        setResult(666,intent);
        finish();
    }
}

//intent.putExtra("data", "今天是安卓开发课.\n" );