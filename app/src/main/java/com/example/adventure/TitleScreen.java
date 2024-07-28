package com.example.adventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TitleScreen extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

    }

    public void goGameScreen(View view)
    {
        Intent gameScreen = new Intent(this,GameScreen.class);
        startActivity(gameScreen);
    }
}