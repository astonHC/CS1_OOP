// COPYRIGHT (C) HARRY CLARK 2024

// CS1_OOP STUDY MATERIAL

// THIS FILE PERTAINS TOWARDS THE BASE USAGE OF METHODS
// TO EVOKE A SCENARIO WHEREBY THERE IS AN RPG TEAM OF PLAYER CHARACTERS

import java.io.IOException;
import java.util.ArrayList;

public abstract class PLAYER implements METHODS
{
    private static ArrayList<Integer> PLAYER_LIST = new ArrayList<Integer>();
    private static int PLAYER_SIZE = 0;

    // ADD PLAYERS TO THE PARTY BASED ON AN ARBITRARY SIZE OF
    // THE ARRAYLIST

    public <T> void ADD_PLAYERS(Class<T> PLAYER_TYPE)
    {
        for(int PLAYERS : PLAYER_LIST)
        {
            SET(PLAYER_TYPE);
            EVALUATE_TEAM_SIZE();
        }
    }

    // SET THE INDEXXING OF PEOPLE PER PARTY

    public <T> void SET(Class<T> PLAYER_TYPE)
    {

        PLAYER_LIST.add(1);         // Makoto
        PLAYER_LIST.add(2);         // Yukari
        PLAYER_LIST.add(3);         // Junpei
        PLAYER_LIST.add(4);         // Akihiko
        PLAYER_LIST.add(5);         // Mitsuru
    }

    public static int EVALUATE_TEAM_SIZE()
    {
        for(int TYPE : PLAYER_LIST)
        {
            System.out.println("There are " + ":" + "in" + PLAYER_LIST);
        }

        return PLAYER_SIZE;
    }
}
