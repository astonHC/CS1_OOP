// COPYRIGHT (C) HARRY CLARK 2024

// CS1_OOP STUDY MATERIAL

// THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY AND STUDY OF ARRAYLISTS
// DETERMINING THEIR FUNCTIONALITY TO BE ABLE TO EFFECTIVELY DATA STRUCTURES

import java.util.ArrayList;

public abstract class AL 
{
    private static int INCREMENT = 1;
    private static final ArrayList<Integer> NUM_LIST = new ArrayList<Integer>();

    // THIS FUNCTION ASSUMES THAT FOR EVERY INDEX IN THE 
    // NUMBER ARRAY LIST, A NEW INDEX WILL BE ADDED BASED
    // ON AN ARBITRARY INCREMENTOR 

    public static void ADD_NUMBERS()
    {
        for (int i = 0; i < 10; i++)
        {
            NUM_LIST.add(i * INCREMENT);
        }
    }

    // EVALUATE THE SIZE BY DETERMING LIKE TERMS IN THE LIST
    // USE THE GET METHOD TO EVALUATE THE INDEXXING IN THE LIST

    public static int EVALUATE_SIZE()
    {
        int SIZE = 0;
        for(Integer i = 0; i < NUM_LIST.size(); i++)
        {
            NUM_LIST.get(i);
            System.out.println("The size of the List is " + i + SIZE);
            SIZE++;
        }

        return SIZE;
    }
}
