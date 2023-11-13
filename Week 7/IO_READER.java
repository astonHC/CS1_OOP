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

class CONTACT_CANVAS
{
    private static ArrayList<CONTACT> CONTACT_LIST;
    private static int CURRENT_INDEX;

    public CONTACT_CANVAS()
    {
        CONTACT_LIST = new ArrayList<>();
        CURRENT_INDEX = 0;
    }

    public static final void ADD_CONTACT(CONTACT CONTACTS)
    {
        CONTACT_LIST.add(CONTACTS);
    }

    public static final void DISPLAY_CONTACTS(int RESULT) 
    {
        RESULT = CURRENT_INDEX >= 0 && CURRENT_INDEX < CONTACT_LIST.size() ? 1 : 0;
        
        switch (RESULT) 
        {
        case 1:
            CONTACT CURRENT_CONTACT = CONTACT_LIST.get(CURRENT_INDEX);
            System.out.println(CURRENT_CONTACT.toString());
            break;
        case 0:
            System.out.println("No contacts to display");
            break;
        default:
            break;
        }
    }

    public static final void NEXT_CONTACT()
    {
        if(CURRENT_INDEX < CONTACT_LIST.size() - 1)
        {
            CURRENT_INDEX++;
        }

        DISPLAY_CONTACTS(0);
    }
}
