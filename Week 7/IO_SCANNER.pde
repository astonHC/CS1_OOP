import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import controlP5.*;

Table table;
int currentRow = 0;
int numRows;

void setup() {
  size(400, 200);
  
  // Load CSV file
  table = loadTable("D:\\Programming Projects\\CS1_OOP\\Week 7\\contact.csv", "header");
  numRows = table.getRowCount();

  // Shuffle rows
  shuffleRows();

  // Create button
  ControlP5 cp5 = new ControlP5(this);
  Button button = cp5.addButton("nextButton")
                     .setValue(0)
                     .setPosition(20, 160)
                     .setSize(80, 30)
                     .setCaptionLabel("Next");

  // Callback function for button
  button.addCallback(new CallbackListener() {
    public void controlEvent(CallbackEvent event) {
      if (event.getAction() == ControlP5.ACTION_RELEASED) {
        nextRow();
      }
    }
  });
}

void draw() {
  background(255);

  // Display current row data
  if (currentRow < numRows) {
    TableRow row = table.getRow(currentRow);
    String forename = row.getString("Forename");
    String surname = row.getString("Surname");
    String email = row.getString("Email");
    String phoneNo = row.getString("Phone No.");

    // Display data as per your requirements
    println("Row: " + (currentRow + 1));
    println("Forename: " + forename);
    println("Surname: " + surname);
    println("Email: " + email);
    println("Phone No: " + phoneNo);
  } else {
    println("No more rows.");
  }
}

void nextRow() {
  currentRow++;
  if (currentRow >= numRows) {
    currentRow = 0;  // Loop back to the first row if reached the end
    shuffleRows();   // Shuffle rows again
  }
}

void shuffleRows() {
  // Shuffle rows in the table
  for (int i = 0; i < numRows; i++) {
    int indexA = (int) random(numRows);
    int indexB = (int) random(numRows);
    swapRows(table, indexA, indexB);
  }

  currentRow = 0;  // Reset currentRow after shuffling
}

void swapRows(Table t, int rowA, int rowB) {
  TableRow tempRow = t.getRow(rowA);
  t.setRow(rowA, t.getRow(rowB));
  t.setRow(rowB, tempRow);
}
