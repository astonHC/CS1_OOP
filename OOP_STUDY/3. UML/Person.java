// COPYRIGHT (C) HARRY CLARK 2024

// CS1_OOP STUDY MATERIAL

// THIS FILE PERTAINS TOWAARDS THE MAIN FUNCITONALITY OF THIS STUDY

// FOCUSSING ON THE CONVERSION BETWEEN UML TO JAVA - IN RELATION TO THE ONE
// EXAM QUESTION WITH 12 MARKS

public class Person
{
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getID()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
