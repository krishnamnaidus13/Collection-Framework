import java.util.*;
import java.lang.*;
import java.io.*;

class PriorityQueue
{
  public static void main(String[] args)
  {

    /*
    --> PriorityQueue is a part of collection framework.
    --> Used when the objects are supposed to be processed based on priority
    --> Rich Library

    Frequently used methods are:
    1. peek()
    2. poll()
    3. add()
    4. size()
    5. isEmpty()
    */

    /*------------------------min heap---------------------*/

    PriorityQueue<Integer> p= new PriorityQueue<Integer>();
    // add() method adds elements in the queue
    p.add(10);
    p.add(20);
    p.add(15);

    // returns the top priorityqueue
    //here minimum element in the priorityqueue
    System.out.println(p.peek());//10

    //remove peek() element
    p.poll();

    System.out.println(p.peek());//15

    // return size
    System.out.println(p.size());//1

    if(p.isEmpty())
    {
      System.out.print("PriorityQueue is empty");
    }


    /*------------------------max heap---------------------*/

    PriorityQueue<Integer> p= new PriorityQueue<Integer>(Collections.reverseOrder());
    // add() method adds elements in the queue
    p.add(10);
    p.add(20);
    p.add(15);

    // returns the top priorityqueue
    //here minimum element in the priorityqueue
    System.out.println(p.peek());//20

    //remove peek() element
    p.poll();

    System.out.println(p.peek());//15

    // return size
    System.out.println(p.size());//1

    if(p.isEmpty())
    {
      System.out.print("PriorityQueue is empty");
    }




  }
}
