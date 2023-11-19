/* COPYRIGHT (C) HARRY CLARK */

/* CS1_OOP GENERAL JAVA HELP */

/* AS A SLAP IN THE FACE WITH REGARDS TO JAVA AS A LANGUAGE, ALLOW ME TO RE-WRITE MY JAVA DOTW */
/* PROGRAM IN C# */

/* BECAUSE JAVA'S SUPPOSED "SURROGATE" MEANS OF METHOD MODIFIERS AND ACCESSORS */
/* GIVE ME AN ANEURYSM AND SERVE TO PROVE HOW MUCH OF A HEADACHE OOD IS IN GENERAL */

/* THE FOLLOWING FILE SERVES TO SHOWCASE HOW TO WORK WITH USER INPUTS */

using System;

public static class DOTW
{
    public static int USER_INPUT;

    public enum DAYS
    {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
    }

    public static DAYS DAY_OF_WEEK(int USER_INPUT)
    {
        DAYS DAY;

        switch (USER_INPUT)
        {
            case 1:
                DAY = DAYS.SUNDAY;
                break;

            case 2:
                DAY = DAYS.MONDAY;
                break;

            case 3:
                DAY = DAYS.TUESDAY;
                break;

            case 4:
                DAY = DAYS.WEDNESDAY;
                break;

            case 5:
                DAY = DAYS.THURSDAY;
                break;

            case 6:
                DAY = DAYS.FRIDAY;
                break;

            case 7:
                DAY = DAYS.SATURDAY;
                break;

            default:
                throw new ArgumentException("Invalid Input. Please enter a number between 1 and 7.");
        }

        return DAY;
    }
}

public static class Program
{
    private static void Main()
    {
        Console.Write("Enter a number between 1 and 7: ");
        DOTW.USER_INPUT = int.Parse(Console.ReadLine());
        DOTW.DAYS DOW;

        /* USE A TRY CATCH TO BE ABLE TO DETERMINE THE UNSATISFACTORY */
        /* PASSED THROUGH THE PROGRAM */

        try
        {
            DOW = DOTW.DAY_OF_WEEK(DOTW.USER_INPUT);
            Console.WriteLine($"The day of the week is: {DOW}");
        }
        catch (ArgumentException EXEC)
        {
            Console.WriteLine($"Error: {EXEC.Message}");
        }
    }
}
