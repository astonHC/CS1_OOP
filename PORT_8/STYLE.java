/* COPYRIGHT (C) HARRY CLARK 2033 */

/* CS1_OOP PORTFOLIO 8 */

/* THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF PROVIDING THE STYLES */
/* AND THE PRE-REQUISTIES THAT COME WITH IT SUCH AS CHANGING OF COLOUR */
/* BASED OF USER IO */

public final class STYLE
{
    private static String COLOUR_NAME;
    private static int BG_COLOUR;
    private static int STROKE_COLOUR;
    private static int FILL_COLOUR;
    private static int TEXT_SIZE;

    /* CONSTRUCT THE FOLLOWING TYPES TO ESTABLISH A STATIC OBJECT */

    public STYLE(String COLOUR_NAME, int BG, int STROKE, int FILL, int TEXT)
    {
        this.COLOUR_NAME = COLOUR_NAME;
        this.BG_COLOUR = BG;
        this.STROKE_COLOUR = STROKE;
        this.FILL_COLOUR = FILL;
        this.TEXT_SIZE = TEXT;
    }

    public static String GET_COLOUR()
    {
        return COLOUR_NAME;
    }

    public static int GET_BG_COLOUR()
    {
        return BG_COLOUR;
    }

    public static int GET_STROKE_COLOUR()
    {
        return STROKE_COLOUR;
    }

    public static int GET_FILL_COLOUR()
    {
        return FILL_COLOUR;
    }

    public static int GET_TEXT_SIZE()
    {
        return TEXT_SIZE;
    }
}