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
}
