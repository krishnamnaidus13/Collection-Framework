import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedHashMap
{
  public static void main(String[] args)
  {

    /*
    --> LinkedHashMap is a part of collection framework.
    --> Stores data in the form key value pair
    --> Stores only unique key elements with values
    --> Preserves order of insertion
    --> Rich Library

    Frequently used methods are:
    1. put
    2. get
    3. remove
    4. Size
    5. isEmpty
    6. getKey
    7. getValue
    8. containsKey
    */

    LinkedHashMap<Integer,Integer> h= new LinkedHashMap<Integer,Integer>();

    // put method takes key and value pair
    h.put(1,100);
    h.put(2,200);
    h.put(1,300);
    h.put(3,300);

    // returns size of map
    System.out.println(h.size());

    // checks if key is present in the map or not
    if(h.containsKey(3))
    {
      System.out.println("Element is present in the map");
    }

    //removes the element with key specified as parameter
    h.remove(3);

    //returns the value of specified key
    System.out.println(h.get(1));

    // for loop to traverse map
    for(Map.Entry<Integer,Integer> e: h.entrySet())
    {
      System.out.println("key : value =",e.getKey(),e,getValue());
    }




  }
}
