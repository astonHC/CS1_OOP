// COPYRIGHT (C) HARRY CLARK 2033

// CS1_OOP PORTFOLIO 9

// THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF PROVIDING 
// LIASSE BETWEEN A DATA SHEET
// AND PROCESSING TO BE ABLE TO ASCERTAIN AN OUTCOME //

import java.util.Scanner;

// CONSTRUCTORS

PHONE_LIST LIST;
PHONE_MAP MAP;

// PUBLIC METHODS FOR EASE OF USE

String SCAN_NEXT_LINE;
String[] LINE_DATA;
String PHONE_BRAND;
String PHONE_MODEL;
String PHONE_ANNOUNCED;
String PHONE_MEM;
float PHONE_WEIGHT;
int PHONE_PRICE;

void setup()
{
  // CONCATENATE NEW TYPES BASED ON THESE CLASSES 
  // READ THE DATA ACCORDING TO THESE CLASSES
  
  LIST = new PHONE_LIST();
  MAP = new PHONE_MAP();
  READ_DATA();
  Scanner SCAN = InputReader.getScanner("phoneData.csv");
  
  println("Original Phone List: ");
  println(LIST);
  
  LIST.SORT_PHONE_TYPES();
  println("Sorted Phone List: ");
  println(LIST);
}

void READ_DATA()
{
   Scanner SCANNER = InputReader.getScanner("phoneData.csv");
  
  if(SCANNER != null)
  {
    SCANNER.nextLine();
    
    // ASSUMING THAT THE DATASHEET INCLUDES A NEW LINE
    // MEANING THAT IT HASN'T REACHED THE END OF THE DATASHEET
    // CONCATENATE THE FOLLOWING TYPES IN RELATION TO THE PHONE CLASS
    
    while(SCANNER.hasNextLine())
    {
        SCAN_NEXT_LINE = SCANNER.nextLine();
        LINE_DATA = SCAN_NEXT_LINE.split(",");
        PHONE_BRAND = LINE_DATA[0];
        PHONE_MODEL = LINE_DATA[1];
        PHONE_WEIGHT = Float.parseFloat(LINE_DATA[11]);
        PHONE_MEM = LINE_DATA[21];
        PHONE_PRICE = Integer.parseInt(LINE_DATA[36]);
        
        Phone P = new Phone(PHONE_BRAND);
        P.setModel(PHONE_MODEL);
        P.setAnnounced(PHONE_ANNOUNCED);
        P.setWeight_g(PHONE_WEIGHT);
        P.setInternal_memory(PHONE_MEM);
        P.setApprox_price_EUR(PHONE_PRICE);
        LIST.ADD_PHONE(P);
        MAP.ADD_PHONE(P);
    }
  }
}
