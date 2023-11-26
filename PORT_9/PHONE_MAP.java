/* COPYRIGHT (C) HARRY CLARK 2033 */

/* CS1_OOP PORTFOLIO 9 */

/* THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF PROVIDING LIASSE BETWEEN A DATA SHEET */
/* AND PROCESSING TO BE ABLE TO ASCERTAIN AN OUTCOME */

/* SYSTEM INCLUDES */

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList.*;

public class PHONE_MAP
{
    private static final HashMap<String, Phone> PHONE_MAP = new HashMap<>();
    private static String PHONE_KEY;
    private static String PHONE_KEY_MAP;
    private static final StringBuilder RESULT = new StringBuilder();

    public PHONE_MAP()
    {

    }

    /* ADD THE CORRESPONDING TYPE OF THE PHONE TO THE MAPPED HASHMAP */
    /* THIS IS POSSIBLE BY USING THE PRE-DEFINED METHODS ESTABLISHED IN "Phone.java" */
    /* TO BE ABLE TO WORK IN TANDEM WITH THE HASHMAP TO ALLOCATE THE CONTENTS */

    public static void ADD_PHONE(Phone PHONE_TYPE)
    {
        PHONE_KEY = PHONE_TYPE.getBrand() + " " + PHONE_TYPE.getModel();
        PHONE_MAP.put(PHONE_KEY, PHONE_TYPE);
    }

    /* FIND THE CORRESPONDING TYPE OF THE PHONE TO THE MAPPED HASHMAP */
    /* THIS FUNCTION WORKS IN A SIMILAR VEIN TO THE ABOVE FUNCTION ALBEIT */
    /* IT FOCUSESS MORE SO ON BEING ABLE TO ESTABLISH CONNECTIONS BETWEEN TYPES */

    public Phone FIND_PHONE_TYPE(String BRAND, String MODEL)
    {
        PHONE_KEY_MAP = BRAND + " " + MODEL;
        return PHONE_MAP.get(PHONE_KEY_MAP);
    }

    /* CONCATENATES A NEW TYPE TO A STRING FROM THE RESULTING OUTPUT */
    /* APPEND INVOLVES THE PROCESS OF PRODUCING THE OUTPUT OF THE STRING */

    /* CREATE A NEW LINE FOR EVERY SUBSEQUENT RESULT */

    public String TO_STRING()
    {
        for(Map.Entry<String, Phone> ENTRY : PHONE_MAP.entrySet())
        {
            RESULT.append(ENTRY.getValue().toString()).append("\n");
        }

        return RESULT.toString();
    }
}
