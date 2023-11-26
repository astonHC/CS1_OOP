/* COPYRIGHT (C) HARRY CLARK 2033 */

/* CS1_OOP PORTFOLIO 9 */

/* THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF PROVIDING LIASSE BETWEEN A DATA SHEET */
/* AND PROCESSING TO BE ABLE TO ASCERTAIN AN OUTCOME */

/* SYSTEM INCLUDES */

import java.io.*;
import java.util.HashMap.*;
import java.util.Scanner.*;
import java.util.ArrayList;

/* THIS CLASS WILL HOUSE THE BASIC NECESSITIES OF BEING ABLE TO ACCESS */
/* THE PHONE TYPES */

/* THE ARRAY LIST WILL ALLOW US TO SORT EACH OF THE TYPES DYNAMICALLY */

public class PHONE_LIST
{
    private static final ArrayList<Phone> PHONE_TYPE = new ArrayList<>();

    /* AN EMPTY CONSTRUCTOR FOR NOW */
    /* I WANT TO SEE IF DECLARING THE PHONE TYPE AS A NEW OBJECT WITHOUT */
    /* A CONSTRUCTOR WOULD WORK */

    public PHONE_LIST()
    {
        
    }

    public static void ADD_PHONE(Phone TYPES)
    {
        PHONE_TYPE.add(TYPES);
    }

}