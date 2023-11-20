/* COPYRIGHT (C) HARRY CLARK */

/* CS1_OOP GENERAL JAVA HELP */

import java.io.*;
import java.util.HashMap;

public class HASH
{
    public static HashMap<String, String> NUMBERS = new HashMap<>();
    public static String TEXT;
    public static String[] CONTACT_VARS;


    public HASH()
    {
        NUMBERS = new HashMap<String, String>();   
    }

    public static void ADD_VALUES()
    {
        NUMBERS.put("Harry", "07939362928");
    }

    public static void FIND_CONTACTS()
    {
        String[] LENGTH = null;
        LENGTH = HASH.TEXT.toLowerCase().split(",");
    }
}

class MAIN
{
    public static void main(String[] args)
    {
        HASH.FIND_CONTACTS();

        for (int i = 0; i < HASH.CONTACT_VARS.length; i++)
        {
            String CONTACT = HASH.NUMBERS.get(HASH.CONTACT_VARS[i]);
        }
    }
}