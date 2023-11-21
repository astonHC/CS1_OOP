/* COPYRIGHT (C) HARRY CLARK 2033 */

/* CS1_OOP PORTFOLIO 8 */

/* THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF PROVIDING THE STYLES */
/* AND THE PRE-REQUISTIES THAT COME WITH IT SUCH AS CHANGING OF COLOUR */
/* BASED OF USER IO */

/* MORE SPECIFICALLY, FOCUSSING THE ATTENTION ON PROVIDING BASE FUNCTIONALITY */
/* FOR THE STYLE BUTTONS AND THEIR PRE-REQUISTIES */

import javafx.stage.Window;

public class BUTTON
{
   private static float X,Y,W,H;
   private static String BUTTON_LABEL;
   
   public BUTTON(float X, float Y, float WIDTH, float HEIGHT, String LABEL)
   {
     this.X = X;
     this.Y = Y;
     this.W = WIDTH;
     this.H = HEIGHT;
     this.BUTTON_LABEL = LABEL;
   }

   /* RETURN THE CONDITION OF THE RELATIVE MOUSE POSITION */
   /* THIS WILL ALL BE TRACKED THROUGH PROCESSING */

   public static final boolean IS_INSIDE(float MOUSE_X_POS, float MOUSE_Y_POS)
   {
        return MOUSE_X_POS >= X && MOUSE_X_POS <= X + W && MOUSE_Y_POS >= Y && MOUSE_Y_POS <= Y + H;
   }

   public static String GET_TEXT()
   {
        return BUTTON_LABEL;
   }
}
