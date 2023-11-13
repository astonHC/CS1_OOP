import java.util.Scanner;

Scanner INPUT;

void setup()
{
    INPUT = IO_READER.GET_SCANNER("D:\\Programming Projects\\CS1_OOP\\Week 7\\contact.csv");

    while(INPUT.hasNext())
    {
        String NEXT_LINE = INPUT.nextLine();
        println(NEXT_LINE);
    }

    println("Done");
}
