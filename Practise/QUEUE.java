package Practise;

import java.util.*;

class CREATE_QUEUE
{
    public static final Queue<String> QUEUE = new LinkedList<String>();
}

public class QUEUE 
{
    public static void main(String[] args)
    {
        CREATE_QUEUE.QUEUE.offer("Harry");
        System.out.println("Queue elements: " + CREATE_QUEUE.QUEUE);
    }
}
