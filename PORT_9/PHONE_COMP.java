/* COPYRIGHT (C) HARRY CLARK 2033 */

/* CS1_OOP PORTFOLIO 9 */

/* THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF PROVIDING LIASSE BETWEEN A DATA SHEET */
/* AND PROCESSING TO BE ABLE TO ASCERTAIN AN OUTCOME */

/* SYSTEM INCLUDES */

import java.util.Comparator;

public abstract class PHONE_COMP implements Comparator<Phone>
{
    public PHONE_COMP()
    {

    }

    public int COMPARE(Phone TYPE_1, Phone TYPE_2)
    {
        return Integer.compare(TYPE_1.getApprox_price_EUR(), TYPE_2.getApprox_price_EUR());
    }
}
