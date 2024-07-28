package com.example.adventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameScreen extends AppCompatActivity
{
    ImageView image;
    TextView text;
    Button button1, button2, button3, button4;

    Story story = new Story(this);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        setupControls();

        story.startingPoint();

    }

    private void setupControls()
    {
        image = findViewById(R.id.gameimageView);
        text = findViewById(R.id.storyTextView);
        button1 = findViewById(R.id.choicebutton1);
        button2 = findViewById(R.id.choicebutton2);
        button3 = findViewById(R.id.choicebutton3);
        button4 = findViewById(R.id.choicebutton4);

    }
    public void button1 (View view)
    {
        story.selectposition(story.nextPosition1);
    }
    public void button2 (View view)
    {
        story.selectposition(story.nextPosition2);
    }
    public void button3 (View view)
    {
        story.selectposition(story.nextPosition3);
    }
    public void Button4 (View view)
    {
        story.selectposition(story.nextPosition4);
    }

    public void goTitleScreen()
    {
        Intent titleScreen = new Intent(this,TitleScreen.class);
        startActivity(titleScreen);
    }
}