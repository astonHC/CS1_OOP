/* COPYRIGHT (C) HARRY CLARK */

/* CS1_OOP GENERAL JAVA HELP */

/* BECAUSE JAVA GIVES ME A HEADACHE, I CONJURED UP A */
/* PROCESS TO BE ABLE TO ENGAGE WITH THE LANGUAGE A BIT MORE */

/* THE FOLLOWING FILE SERVES TO SHOWCASE HOW TO WORK WITH USER INPUTS */

import java.util.Scanner;

public class DOTW 
{
    public static final class METHODS
    {
        private static final int DAY = 0;
        public static final Scanner USER_IO = new Scanner(System.in);
    }


    public static void SWITCH_DAY()
    {
        switch (METHODS.DAY) {
            case 1:
                System.out.println("Today is Monday");
                break;

            case 2:
                System.out.println("Today is Tuesday");
                break;

            case 3:
                System.out.println("Today is Wednesday");
                break;

            case 4:
                System.out.println("Today is Thursday");
                break;

            case 5:
                System.out.println("Today is Friday");
                break;

            case 6:
                System.out.println("Today is Saturday");
                break;

            case 7:
                System.out.println("Today is Sunday");
                break;
        
            default:
                break;
        }
    }
}

class MAIN
{
    public static void main(String[] args)
    {
        DOTW DAY = new DOTW();

        System.out.println("Enter a number between 1 and 7");

        DAY.METHODS.USER_IO();
        DOTW.METHODS.SWITCH_DAY();
    }
}
