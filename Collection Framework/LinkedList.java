import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedList
{
  public static void main(String[] args)
  {

    /*
    --> LinkedList is a part of collection framework.
    --> Dynamic Arrays
    --> Rich Library

    Frequently used methods are:
    1. add()
    2. remove()
    3. set()
    4. size()
    5. isEmpty()
    6. contains()
    7. indexOf()

    */

    // Declaration
    LinkedList<Integer> al= new LinkedList<Integer>();

    // add method of LinkedList
    for(int i=0;i<=10;i++)
    {
      al.add(i*10);
    }

    //remove element at index 1 from LinkedList
    al.remove(1);
    //remove element 20 from LinkedList
    al.remove(20);

    //set element at index 0 to 1000
    al.set(0,1000);
    //set element at index 1 to 500
    al.add(1,500);

    //size() returns the size of LinkedList
    if(al.size()>0)
    {
      System.out.println("Size of LinkedList is : ",al.size());
    }

    //isEmpty() returns true if LinkedList is Empty
    if(al.isEmpty()==false)
    {
      System.out.println("LinkedList is not empty");
    }

    //contains() check if the passed element is present in LinkedList or not
    if(al.contains(50))
    {
      System.out.println("LinkedList contains 50");
    }
    else
    {
      System.out.println("LinkedList does not contain 50");
    }


    //returns the indexOf() of the element from the LinkedList
    if(al.indexOf(50))
    {
      System.out.println("indexOf 50 is :",al.indexOf(50));
    }

  }
}
