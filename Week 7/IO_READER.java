/* COPYRIGHT (C) HARRY CLARK */

/* CS1_OOP WEEK 7 */

/* THIS FILE PERTAINS TOWARDS THE LOGIC OF PARSING THE CONTENTS OF A CSV FILES */
/* WITH THE INTENTION OF TRANSPOSING THIS LOGIC OVER TOWARDS PROCESSING TO */
/* DISPLAY THE CORRESPONDENCE */

/* THIS WILL BE A DEMONSTRATION OF USING ARRAYLIST AS PER THIS WEEK'S LECTURE */

/* NESTED INCLUDES */

import java.util.ArrayList;
import java.io.*;

class CONTACT
{
    private String FORENAME;
    private String LASTNAME;
    private String EMAIL;
    private String PHONE_NO; 

    public CONTACT(String FORENAME, String LASTNAME)
    {
        this.FORENAME += FORENAME;
        this.LASTNAME += LASTNAME;
    }

    public final void SET_EMAIL(String EMAIL)
    {
        this.EMAIL += EMAIL;
    }

    public final void SET_PHONE_NO(String PHONE_NO)
    {
        this.PHONE_NO += PHONE_NO;
    }

    /* HANDLE IO EXCEPTION FOR UNIT TESTING PURPOSES TO ENSURE THAT ALL FIELDS ARE BEING */
    /* ACCOUNTED FOR WHEN PARSING THE CSV */

    public final String CONCATENATE_TYPE() throws IOException
    {
        return "Name: " + FORENAME + " " + LASTNAME + "\nEmail: " + EMAIL + "\nPhone Number: " + PHONE_NO; 
    }
}

