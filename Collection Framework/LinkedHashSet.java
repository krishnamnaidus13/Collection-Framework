import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedHashSet
{
  public static void main(String[] args)
  {

    /*
    --> LinkedHashSet is a part of collection framework.
    --> Stores only unique elements
    --> preserves order of insertion
    --> Rich Library

    Frequently used methods are:
    1. add
    2. remove
    3. size
    4. contains

    */

    LinkedHashSet<Integer> h= new LinkedHashSet<Integer>();

    // Adds element into the LinkedHashSet
    h.add(10);//[10]
    h.add(20);//[10,20]
    h.add(10);//[10,20]
    h.add(30);//[10,20,30]

    //returns the size of set
    System.out.println(h.size());//3

    //contains() check whether element is present or not
    if(h.contains(20))//returns true
    {
      System.out.println("20 is present in the set");
    }

    // removes element from the set
    h.remove(10);//[20,30]

    System.out.println(h.size());//2

  }
}
