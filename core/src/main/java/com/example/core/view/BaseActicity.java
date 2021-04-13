package com.example.core.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public  class BaseActicity extends AppCompatActivity {



    public void startActicity(Class<?> clazz){
        startActivity(new Intent(this,clazz));

    }
    public void startActivity(Class<?> clazz, Bundle bundle){
        Intent intent = new Intent(this, clazz);
        intent.putExtra("data",bundle);
        startActivity(intent);
    }

    public void showMsg(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void showLongMsg(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
    public void showLoading(String msg){

    }
    public void hideLoading(String msg){

    }
}
