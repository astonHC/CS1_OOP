// COPYRIGHT (C) HARRY CLARK 2033

// CS1_OOP PORTFOLIO 9

// THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF PROVIDING 
// LIASSE BETWEEN A DATA SHEET
// AND PROCESSING TO BE ABLE TO ASCERTAIN AN OUTCOME //

import java.util.Scanner;

// CONSTRUCTORS

PHONE_LIST LIST;
PHONE_MAP MAP;
PHONE_LINES PHONE_LINE;

void setup()
{
  // CONCATENATE NEW TYPES BASED ON THESE CLASSES 
  // READ THE DATA ACCORDING TO THESE CLASSES
  
  LIST = new PHONE_LIST();
  MAP = new PHONE_MAP();
  PHONE_LINE = new PHONE_LINES();
  READ_DATA();
  Scanner SCAN = InputReader.getScanner("phoneData.csv");
  
  println("Original Phone List: ");
  println(LIST.TO_STRING());
  
  println("Sorted Phone List: ");
  LIST.SORT_PHONE_TYPES();
  println(LIST.TO_STRING());
  
  LIST.SORT_PHONE_TYPES();
  println("Sorted Phone List: ");
  println(LIST);
  
  String FIND_BRAND = "";
  String FIND_MODEL = "";
  Phone FOUND_PHONE = LIST.FIND_WHICH_PHONE(FIND_BRAND, FIND_MODEL);
  
  if(FOUND_PHONE != null)
  {
     println("Found phone in List: " + FOUND_PHONE);
  }
  
  else
  {
     println("Phone not found in List."); 
  }
}

void READ_DATA()
{
   Scanner SCANNER = InputReader.getScanner("D:\\Programming\\CS1_OOP\\LAB9\\LAB9\\phoneData.csv");
  
  if(SCANNER != null)
  {
    SCANNER.nextLine();
    
    // ASSUMING THAT THE DATASHEET INCLUDES A NEW LINE
    // MEANING THAT IT HASN'T REACHED THE END OF THE DATASHEET
    // CONCATENATE THE FOLLOWING TYPES IN RELATION TO THE PHONE CLASS
    
    while(SCANNER.hasNextLine())
    {
        PHONE_LINE.SCAN_NEXT_LINE = SCANNER.nextLine();
        PHONE_LINE.LINE_DATA = PHONE_LINE.SCAN_NEXT_LINE.split(",");
        PHONE_LINE.PHONE_BRAND = PHONE_LINE.LINE_DATA[0];
        PHONE_LINE.PHONE_MODEL = PHONE_LINE.LINE_DATA[1];
        PHONE_LINE.PHONE_WEIGHT = Float.parseFloat(PHONE_LINE.LINE_DATA[11]);
        PHONE_LINE.PHONE_MEM = PHONE_LINE.LINE_DATA[21];
        PHONE_LINE.PHONE_PRICE = Integer.parseInt(PHONE_LINE.LINE_DATA[36]);
        
        Phone P = new Phone(PHONE_LINE.PHONE_BRAND);
        P.setModel(PHONE_LINE.PHONE_MODEL);
        P.setAnnounced(PHONE_LINE.PHONE_ANNOUNCED);
        P.setWeight_g(PHONE_LINE.PHONE_WEIGHT);
        P.setInternal_memory(PHONE_LINE.PHONE_MEM);
        P.setApprox_price_EUR(PHONE_LINE.PHONE_PRICE);
        LIST.ADD_PHONE(P);
        MAP.ADD_PHONE(P);
    }
    
    SCANNER.close();
    println("Size of the PhoneList after reading Data Sheet: " + LIST.GET_PHONE_SIZE());
  }
  
  else
  {
      println("Failed to read data from this file");
  }
}
