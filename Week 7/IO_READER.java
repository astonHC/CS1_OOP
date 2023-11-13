/* COPYRIGHT (C) HARRY CLARK */

/* CS1_OOP WEEK 7 */

/* THIS FILE PERTAINS TOWARDS THE LOGIC OF PARSING THE CONTENTS OF A CSV FILES */
/* WITH THE INTENTION OF TRANSPOSING THIS LOGIC OVER TOWARDS PROCESSING TO */
/* DISPLAY THE CORRESPONDENCE */

/* THIS WILL BE A DEMONSTRATION OF USING ARRAYLIST AS PER THIS WEEK'S LECTURE */

/* NESTED INCLUDES */

import java.util.ArrayList;

class CONTACT
{
    private static String FORENAME;
    private static String LASTNAME;
    private static String EMAIL;
    private static String PHONE_NO; 

    public CONTACT(String FORENAME, String LASTNAME)
    {
        this.FORENAME = FORENAME;
        this.LASTNAME = LASTNAME;
    }

    public void SET_EMAIL(String EMAIL)
    {
        this.EMAIL = EMAIL;
    }
}

