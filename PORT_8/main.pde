// COPYRIGHT (C) HARRY CLARK 2033

// CS1_OOP PORTFOLIO 8

class DISPLAY_TYPES
{
  public String DISPLAY_TEXT;
  public String[] STYLE_NAMES = {"Dark", "Light", "Red", "Blue"};
  public STYLE_COLLECTION CURRENT_COLLECTION;
  public STYLE CURRENT_STYLE;

  public DISPLAY_TYPES()
  {
       CURRENT_COLLECTION = new STYLE_COLLECTION();
  }
}

DISPLAY_TYPES TYPES;

void setup()
{
   size(600, 600); 
   TYPES = new DISPLAY_TYPES();
   SETUP_STYLES();
}

void SETUP_STYLES()
{
    TYPES.CURRENT_COLLECTION = new STYLE_COLLECTION();
    
    STYLE DARK = new STYLE("Dark", color(30), color(150), color(50), 20);
    STYLE LIGHT = new STYLE("Light", color(220), color(50), color(220), 18);
    STYLE RED = new STYLE("Red", color(200, 0, 0), color(255), color(100, 0, 0), 22);
    STYLE BLUE = new STYLE("Blue", color(0, 0, 200), color(50), color(0, 0, 150), 24);
    
    TYPES.CURRENT_COLLECTION.ADD_STYLE(DARK);
    TYPES.CURRENT_COLLECTION.ADD_STYLE(LIGHT);
    TYPES.CURRENT_COLLECTION.ADD_STYLE(RED);
    TYPES.CURRENT_COLLECTION.ADD_STYLE(BLUE);
    
    TYPES.CURRENT_STYLE = DARK;
    TYPES.CURRENT_COLLECTION.SET_DEFAULT(TYPES.CURRENT_STYLE);
}
