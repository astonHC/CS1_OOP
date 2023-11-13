package Practise;

import java.util.LinkedList;
import java.io.*;

class LIST_TYPE 
{
    public static LinkedList<String> CONCATENATE_TYPE = new LinkedList<>();
}

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
