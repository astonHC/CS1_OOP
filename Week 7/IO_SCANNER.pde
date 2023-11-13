/* COPYRIGHT (C) HARRY CLARK */

/* CS1_OOP WEEK 7 */

/* THIS FILE PERTAINS TOWARDS THE LOGIC OF PARSING THE CONTENTS OF A CSV FILES */
/* WITH THE INTENTION OF TRANSPOSING THIS LOGIC OVER TOWARDS PROCESSING TO */
/* DISPLAY THE CORRESPONDENCE */

/* THIS WILL BE A DEMONSTRATION OF USING ARRAYLIST AS PER THIS WEEK'S LECTURE */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import controlP5.*;

Table TABLE;
int CURRENT_ROW = 0;
int NUM_ROWS;

void setup() {
  size(400, 200);
  
  TABLE = loadTable("D:\\Programming Projects\\CS1_OOP\\Week 7\\contact.csv", "header");
  NUM_ROWS = TABLE.getRowCount();

  shuffleRows();

  ControlP5 CP5 = new ControlP5(this);
  Button BUTTON = CP5.addButton("nextButton")
                     .setValue(0)
                     .setPosition(20, 160)
                     .setSize(80, 30)
                     .setCaptionLabel("Next");

  BUTTON.addCallback(new CallbackListener() 
  {
    public void controlEvent(CallbackEvent event) 
    {
      if (event.getAction() == ControlP5.ACTION_RELEASED) 
      {
        nextRow();
      }
    }
  });
}

void draw() 
{
  background(255);

  if (CURRENT_ROW < NUM_ROWS) 
  {
    
    TableRow ROW = TABLE.getRow(CURRENT_ROW);
    String FORENAME = ROW.getString("Forename");
    String SURNAME = ROW.getString("Surname");
    String EMAIL = ROW.getString("Email");
    String PHONE_NO = ROW.getString("Phone No.");

    println("Row: " + (CURRENT_ROW + 1));
    println("Forename: " + FORENAME);
    println("Surname: " + SURNAME);
    println("Email: " + EMAIL);
    println("Phone No: " + PHONE_NO);
  } 
  
  else 
  {
    println("No more rows.");
  }
}

void nextRow() 
{
  CURRENT_ROW++;
  if (CURRENT_ROW >= NUM_ROWS) 
  {
    CURRENT_ROW = 0; 
    shuffleRows();
  }
}

void shuffleRows() 
{
  for (int I = 0; I < NUM_ROWS; I++) {
    int INDEX_A = (int) random(NUM_ROWS);
    int INDEX_B = (int) random(NUM_ROWS);
    swapRows(TABLE, INDEX_A, INDEX_B);
  }

  CURRENT_ROW = 0; 
}

void swapRows(Table T, int ROW_A, int ROW_B) 
{
  TableRow TEMP_ROW = T.getRow(ROW_A);
  T.setRow(ROW_A, T.getRow(ROW_B));
  T.setRow(ROW_B, TEMP_ROW);
}
