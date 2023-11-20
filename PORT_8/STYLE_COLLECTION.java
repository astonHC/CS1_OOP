/* COPYRIGHT (C) HARRY CLARK 2033 */

/* CS1_OOP PORTFOLIO 8 */

/* THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF PROVIDING THE STYLES */
/* AND THE PRE-REQUISTIES THAT COME WITH IT SUCH AS CHANGING OF COLOUR */
/* BASED OF USER IO */

/* MORE SPECIFICALLY, THIS FILE FOCUSSES ON THE FUNCTIONALITY BEHIND */
/* THE USE OF A HASHMAP TO STORE AND ALLOCATE DATA TYPES THROUGHOUT OUR PROGRAM */

/* SYSTEM INCLUDES */

import java.io.*;
import java.util.HashMap;

import java.util.ArrayList;

public final class STYLE_COLLECTION
{
    private static HashMap<String, STYLE> STYLE_TYPE;
    private static STYLE DEFAULT;

    /* CONCATENATE A NEW TYPE BASED ON THE HASHED DATA CONTENTS */
    /* THIS WILL EVALUATE A STYLE BASED ON IT'S NAME AND PRE-REQUISITES */

    public STYLE_COLLECTION()
    {
        STYLE_TYPE = new HashMap<String, STYLE>();
    }

    /* CONCATENATE A STYLE TYPE IN RELATION TO THE LOCAL ARGS OF PUTS */
    /* PUTS IS THE SURROGATE MEANS OF PROVIDING A KEY VALUE WHICH */
    /* ACTS AS A POINTER OF SORTS TOWARDS THE OBJECT IN QUESTION */

    public static final void ADD_STYLE(STYLE STYLE_BASE)
    {
        STYLE_TYPE.put(STYLE.GET_COLOUR(), STYLE_BASE);
    }

    public static STYLE GET_DEFAULT()
    {
        return DEFAULT;
    }

    /* USE THE GET MODIFIER AS PER THE HASH MAP TO BE ABLE TO RETURN */
    /* IT'S DESIGNATED TYPE */

    public static STYLE GET_STYLE_TYPE(String STYLE_NAME)
    {
        return STYLE_TYPE.get(STYLE_NAME);
    }
}
