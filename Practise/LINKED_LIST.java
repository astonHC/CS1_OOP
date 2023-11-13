package Practise;

import java.util.LinkedList;
import java.io.*;

/* CREATES A NEW TYPE FROM A LINKEDLIST WITH THE DESIGNATED TYPE */

class LIST_TYPE 
{
    public static LinkedList<String> CONCATENATE_TYPE = new LinkedList<>();
}

/* ABSTRACT THE CONTENTS OF THE ABOVE CLASS TO CREATE NEW TYPES */
/* THE PUSH METHOD IS A REPRESENTATION OF THE STACK WHEREBY WE ARE PUSHING */
/* ELEMENTS ONTO IT - TYPICALLY IN A BIG ENDIANESS MANNER */

public class LINKED_LIST 
{
    public static final void CREATE_TYPES()
    {
        LIST_TYPE.CONCATENATE_TYPE.push("H");
        LIST_TYPE.CONCATENATE_TYPE.push("A");
        LIST_TYPE.CONCATENATE_TYPE.push("R");
        LIST_TYPE.CONCATENATE_TYPE.push("R");
        LIST_TYPE.CONCATENATE_TYPE.push("Y");
    }

    public static void main(String[] args)
    {
        CREATE_TYPES();
        System.out.println(LIST_TYPE.CONCATENATE_TYPE);
    }
}
