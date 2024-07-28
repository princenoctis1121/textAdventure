package com.example.adventure;

import android.view.View;

public class Story
{
    GameScreen gs;
    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
    boolean greatSword = false;
    boolean levelmax = false;

    public Story(GameScreen gs)
    {
        this.gs = gs;
    }

    public void selectposition(String position)
    {
        switch (position)
        {
            case "startingPoint": startingPoint();break;
            case "sign": sign();break;
            case "door": door();break;
            case "fish": fish();break;
            case "sword": sword();break;
            case "monster": monster();break;
            case "attack": attack();break;
            case "dead": dead();break;
            case "goTitleScreen": gs.goTitleScreen();break;
        }
    }

    public void showAllButtons()
    {
        gs.button1.setVisibility(View.VISIBLE);
        gs.button2.setVisibility(View.VISIBLE);
        gs.button3.setVisibility(View.VISIBLE);
        gs.button4.setVisibility(View.VISIBLE);
    }

    public void startingPoint()
    {
        gs.image.setImageResource(R.drawable.trail);
        gs.text.setText("Beat the final boss to find treasure. What will you do for now?");

        gs.button1.setText("Go North");
        gs.button2.setText("Go East");
        gs.button3.setText("Go West");
        gs.button4.setText("Read sign");

        showAllButtons();

        nextPosition1 = "monster";
        nextPosition2 = "sword";
        nextPosition3 = "door";
        nextPosition4 = "sign";
    }
    public void sign()
    {
        gs.image.setImageResource(R.drawable.sign);
        gs.text.setText("'Monster ahead, challenge it only when you are strong enough!'");
        gs.button1.setText("Back");
        //gs.button2.setText("");
        //gs.button3.setText("");
        //gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "startingPoint";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

    }

    public void door()
    {
        gs.image.setImageResource(R.drawable.doorway);
        gs.text.setText("There is a door.");
        gs.button1.setText("Go inside");
        gs.button2.setText("Go back");
        //gs.button3.setText("");
        //gs.button4.setText("");
        //gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "fish";
        nextPosition2 = "startingPoint";
        nextPosition3 = "";
        nextPosition4 = "";
    }

    public void fish()
    {
        if (greatSword == false)
        {
            gs.image.setImageResource(R.drawable.fish);
            gs.text.setText("Fish monster attacks you!!");
            gs.button1.setText("...");
            //gs.button2.setText("");
            //gs.button3.setText("");
            //gs.button4.setText("");
            gs.button2.setVisibility(View.INVISIBLE);
            gs.button3.setVisibility(View.INVISIBLE);
            gs.button4.setVisibility(View.INVISIBLE);

            nextPosition1 = "dead";
            nextPosition2 = "";
            nextPosition3 = "";
            nextPosition4 = "";
        }
        if (greatSword == true)
        {
            gs.image.setImageResource(R.drawable.fish);
            gs.text.setText("Fish monster attacks you!!\n\nYou defeated it with Great Sword!\nAnd your level up to 9999!");

            levelmax = true;

            gs.button1.setText("Back");
            //gs.button2.setText("");
            //gs.button3.setText("");
            //gs.button4.setText("");
            gs.button2.setVisibility(View.INVISIBLE);
            gs.button3.setVisibility(View.INVISIBLE);
            gs.button4.setVisibility(View.INVISIBLE);

            nextPosition1 = "startingPoint";
            nextPosition2 = "";
            nextPosition3 = "";
            nextPosition4 = "";
        }
    }

    public void sword()
    {
        gs.image.setImageResource(R.drawable.sword);
        gs.text.setText("There is a great sword!!\nYou are sword master now!!");

        greatSword = true;

        gs.button1.setText("Back");
        //gs.button2.setText("");
        //gs.button3.setText("");
        //gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "startingPoint";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }

    public void monster()
    {
        gs.image.setImageResource(R.drawable.gargoyle);
        gs.text.setText("Final boss Gargoyle appeared!!");

        gs.button1.setText("Attack");
        gs.button2.setText("Run away");
        //gs.button3.setText("");
        //gs.button4.setText("");
        //gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "attack";
        nextPosition2 = "startingPoint";
        nextPosition3 = "";
        nextPosition4 = "";
    }

    public void attack()
    {
        if (greatSword == true && levelmax == true)
        {
            gs.image.setImageResource(R.drawable.treasure);
            gs.text.setText("You beat the final boss with great sword and get the treasure!!\n\nYou are the hero!!\n\n-THE END-");

            gs.button1.setText("Back to Title Screen");
            //gs.button2.setText("");
            //gs.button3.setText("");
            //gs.button4.setText("");
            gs.button2.setVisibility(View.INVISIBLE);
            gs.button3.setVisibility(View.INVISIBLE);
            gs.button4.setVisibility(View.INVISIBLE);

            nextPosition1 = "goTitleScreen";
            nextPosition2 = "";
            nextPosition3 = "";
            nextPosition4 = "";
        }
        else
        {
            gs.image.setImageResource(R.drawable.gargoyle);
            gs.text.setText("Final boss has beaten you.\n\nYou have no chance to win.");

            gs.button1.setText("...");
            //gs.button2.setText("");
            //gs.button3.setText("");
            //gs.button4.setText("");
            gs.button2.setVisibility(View.INVISIBLE);
            gs.button3.setVisibility(View.INVISIBLE);
            gs.button4.setVisibility(View.INVISIBLE);

            nextPosition1 = "dead";
            nextPosition2 = "";
            nextPosition3 = "";
            nextPosition4 = "";
        }
    }

    public void dead()
    {
        gs.image.setImageResource(R.drawable.grave);
        gs.text.setText("You are dead.\n\nGame Over.");
        gs.button1.setText("Back to title");
        //gs.button2.setText("");
        //gs.button3.setText("");
        //gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "goTitleScreen";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
}
