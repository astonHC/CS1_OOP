/* COPYRIGHT (C) HARRY CLARK 2033 */

/* CS1_OOP PORTFOLIO 9 */

/* THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF PROVIDING LIASSE BETWEEN A DATA SHEET */
/* AND PROCESSING TO BE ABLE TO ASCERTAIN AN OUTCOME */

/* SYSTEM INCLUDES */

import java.io.*;
import java.util.HashMap.*;
import java.util.Scanner.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

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

    /* THESE FUNCTIONS USES THE CORRESPONDING FUNCTIONS TO ADD, SORT AND EVALUATE */
    /* EACH RESPECTIVE COMPONENT OF THE DATA SHEET */

    public static void ADD_PHONE(Phone TYPES)
    {
        PHONE_TYPE.add(TYPES);
    }

    public static int GET_PHONE_SIZE()
    {
        return PHONE_TYPE.size();
    }

    /* SORT THE PHONE TYPE USING THE COLLECTIONS NAMESPACE */
    /* --------------------------------------------------- */
    /* TO DO:                                              */
    /* --------------------------------------------------- */
    /* FIGURE OUT WHETHER OR NOT THE NULL TERMINATOR WILL WORK */
    /* AS IT WON'T ALLOW ME TO JUST USE THE ARRAYLIST AS IT'S */
    /* OWN ARG */

    public static void SORT_PHONE_TYPES()
    {
        Collections.sort(PHONE_TYPE, null);
    }

    /* THIS FUNCTION REPRESENT THE ACCESS METHOD USED TO ACCESS THE PHONE FROM THE DATA SHEET */
    
    public Phone FIND_WHICH_PHONE(String BRAND, String MODEL)
    {
        /* ASSUMING THE ARBITARY LENGTH OF HOW MANY ELEMENTS THERE ARE IN THE DATASHEET */
        /* RETURN THE CORRESPONDING VALUES FOR THE BRAND AND MODEL RELATIVE TO THE SORTED ARRAY LIST */

        for(Phone P : PHONE_TYPE)
        {
            if(P.getBrand().equals(BRAND) && P.getModel().equals(MODEL)) return P;
        }

        return null;
    }

    /* ASSUMING THE ARBITARY LENGTH OF THE PHONE ARRAY LIST */
    /* DYNAMICALLY SORT BY THE MOST EXPENSIVE RELATIVE TO THE MINIMUM PRICE */

    public PHONE_LIST SORT_EXPENSIVE(int MIN_PRICE)
    {
        PHONE_LIST MOST_EXPENSIVE = new PHONE_LIST();

        for(Phone P : PHONE_TYPE)
        {
            if(P.getApprox_price_EUR() > MIN_PRICE) MOST_EXPENSIVE .ADD_PHONE(P);
        }

        MOST_EXPENSIVE.SORT_PHONE_TYPES();
        return MOST_EXPENSIVE;
    }

}
