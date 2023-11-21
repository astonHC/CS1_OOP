// COPYRIGHT (C) HARRY CLARK 2033

// CS1_OOP PORTFOLIO 8

// THE FOLLOWING FILE PERTAINS TOWARDS ALL OF THE OTHER PRE-REQUISITIES INVOLVED
// WITH THE FILES ATTACHED TO PROVIDE THE MAIN FUNCTIONALITY FOR THE BUTTONS

public class BUTTON
{
   private float X, Y, W, H;
   private String LABEL;
   
   public BUTTON(float X, float Y, float W, float H, String LABEL)
   {
       this.X = X;
       this.Y = Y;
       this.W = W;
       this.H = H;
       this.LABEL = LABEL;
   }
   
   public void DISPLAY()
   {
     fill(STYLES.GET_STYLE_TYPE(LABEL).GET_FILL_COLOUR());
     stroke(STYLES.GET_STYLE_TYPE(LABEL).GET_STROKE_COLOUR());
     rect(X,Y,W,H);
     fill(255);
     textSize(16);
     textAlign(CENTER, CENTER);
     text(LABEL, X + W / 2, Y + H / 2);
   }

   public boolean IS_INSIDE(float MOUSE_X_POS, float MOUSE_Y_POS)
   {
     return MOUSE_X_POS >= X && MOUSE_X_POS <= X + W && MOUSE_Y_POS >= Y && MOUSE_Y_POS <= Y + H;
   }

   public String GET_TEXT()
   {
     return LABEL;
   }
}

// MISCELLANEOUS METHODS 
// I HAVE THEM SITUATED AT THE TOP TO ALLOW FOR CONVIENIENCE WHEN ACCESSING

String DISPLAY_TEXT;
String[] STYLE_NAMES = {"Dark", "Light", "Red", "Blue"};
STYLE_COLLECTION STYLES;
STYLE CURRENT_STYLE;
BUTTON[] BUTTONS;

void setup()
{
   size(1000, 600); 
   DISPLAY_TEXT = "";
   SETUP_STYLES();
   SETUP_BUTTONS();
}

void SETUP_STYLES()
{
    STYLES = new STYLE_COLLECTION();
    
    STYLE DARK = new STYLE("Dark", color(30), color(150), color(50), 20);
    STYLE LIGHT = new STYLE("Light", color(220), color(50), color(220), 18);
    STYLE RED = new STYLE("Red", color(200, 0, 0), color(255), color(100, 0, 0), 22);
    STYLE BLUE = new STYLE("Blue", color(0, 0, 200), color(50), color(0, 0, 150), 24);
    
    STYLES.ADD_STYLE(DARK);
    STYLES.ADD_STYLE(LIGHT);
    STYLES.ADD_STYLE(RED);
    STYLES.ADD_STYLE(BLUE);
    
    CURRENT_STYLE = DARK;
    STYLES.SET_DEFAULT(CURRENT_STYLE);
}

void draw() 
{
    background(CURRENT_STYLE.GET_BG_COLOUR());
    fill(CURRENT_STYLE.GET_FILL_COLOUR());
    stroke(CURRENT_STYLE.GET_STROKE_COLOUR());
    textSize(CURRENT_STYLE.GET_TEXT_SIZE());
    text(DISPLAY_TEXT, 490, 100);
    
    for (BUTTON B : BUTTONS)
    {
        B.DISPLAY();
    }
}

void SETUP_BUTTONS()
{
     BUTTONS = new BUTTON[STYLE_NAMES.length];
     float BUTTON_WIDTH = width / STYLE_NAMES.length;
     
     for(int i = 0; i < STYLE_NAMES.length; i++)
     {
       BUTTONS[i] = new BUTTON(i * BUTTON_WIDTH, height - 50, BUTTON_WIDTH, 50, STYLE_NAMES[i]);
     }
}

void mousePressed()
{
    for(BUTTON B : BUTTONS)
    {
       if(B != null && B.IS_INSIDE(mouseX, mouseY))
       {
          String SELECTED = B.GET_TEXT();
          CURRENT_STYLE = STYLES.GET_STYLE_TYPE(SELECTED);
          
          if (CURRENT_STYLE != null)
          {
             DISPLAY_TEXT = "Selected Style: " + CURRENT_STYLE.GET_COLOUR(); 
          }
          
          else
          {
             println("Selected Style is Null"); 
          }
       }
    }
}
