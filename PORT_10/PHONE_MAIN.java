/* COPYRIGHT (C) HARRY CLARK 2023 */

/* CS1_OOP PORTFOLIO 10 */

/* THIS FILE SERVES TO SHOWCASE THE CONTINUATION OF THE WORK ESTABLISHED IN WEEK 9 */
/* WHILE VERY SIMILAR IN PRESENTATION, THIS FILE SERVES TO FULLFILL THIS WEEK'S BRIEF BY */
/* BEING ABLE TO USE JAVA WITHOUT THE SURROGATE MEANS OF PROCESSING */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class PHONE_MAIN 
{

    /* USES A TRY CATCH METHOD TO INTIALISE WHEN THE FILE IS READ */
    /* AND UNDER WHICH CIRCUMSTANCES THE FILE SHOULD BE PARSED */

    /* THE REGULAR EXPRESSION OF THE "," PROVIDES INSTRUCTION */
    /* ON HOW THE LINES ARE SEPERATED */

    private static void READ_DATA(String FILE_PATH, PHONE_LIST LIST) 
    {
        try 
        {
            File FILE = new File(FILE_PATH);
            Scanner SCANNER = new Scanner(FILE);

            while (SCANNER.hasNextLine()) 
            {
                String LINE = SCANNER.nextLine();
                String[] DATA = LINE.split(",");

                Phone PHONE = new Phone(DATA[0].trim());
                PHONE.setModel(DATA[1].trim());
                
                LIST.ADD_PHONE(PHONE);
            }

            SCANNER.close();
        } 
        
        /* IF NO CONTENTS ARE AVAILABLE, USE THE PRE-DEFINED EXCEPTION */
        /* AS PER THE LIBRARY */

        catch (FileNotFoundException EXEC) 
        {
            EXEC.printStackTrace();
        }
    }

    /* THE MAIN METHOD PRESENT IN THIS FILE */
    /* FIRST, IT WILL SHOWCASE THE UNSORTED LIST OF PHONE TYPES */

    /* UPON WHICH, AFTER ASKING FOR USER CREDENTIALS, IT WILL PARSE THE CONTENTS */
    /* BASED ON THE ESTABLISHED USER IO */

    public static void main(String[] args)
    {
        PHONE_LIST LIST = new PHONE_LIST();

        READ_DATA("D:\\Programming\\CS1_OOP\\LAB9\\LAB9\\phoneData.csv", LIST);

        System.out.println("List of Phones (Unsorted):");
        System.out.println(LIST.TO_STRING());
        LIST.SORT_PHONE_TYPES();

        Scanner SCANNER = new Scanner(System.in);

        System.out.print("Enter a lower price bound: ");
        int LOWER = SCANNER.nextInt();

        System.out.print("Enter an upper price bound: ");
        int UPPER = SCANNER.nextInt();

        ArrayList<Phone> PRICE_RANGE = LIST.FIND_PHONE_IN_RANGE(LOWER, UPPER);

        System.out.println("List of Phones in Price Range (" + LOWER + " - " + UPPER + " euros):");
        PRICE_RANGE.forEach(PHONE -> System.out.println(PHONE));

        SCANNER.close();
    }
}
