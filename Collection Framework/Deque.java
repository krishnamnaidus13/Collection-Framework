import java.util.*;
import java.lang.*;
import java.io.*;

class Deque
{
  public static void main(String[] args)
  {

    /*
    --> Deque is a part of collection framework.
    --> Can add elements from both the ends of queue
    --> Can remove eleme from both the ends of queue
    --> Rich Library

    Frequently used methods are:
    --> The below methods does not throw an exception
    1. offerFirst()
    2. offerLast()
    3. pollFirst()
    4. pollLast()
    5. peekFirst()
    6. peekLast()

    --> The below methods thro an exception
    1. addFirst()
    2. addLast()
    3. removeFirst()
    4. removeLast()
    5. getFirst()
    6. getLast()

    --> Other Methods are:
    1. size()
    2. isEmpty()

    */

    //Declaration
    Deque<Integer> d= new ArrayDeque<Integer>();
    //              or
    // Deque<Integer> d= new LinkedList<Integer>();

    // addFirst() method add element at the start of the deque
    d.addFirst(1);// [1]
    d.addFirst(2);// [2,1]

    // addLast() method adds element at the end of the deque
    d.addLast(3);// [2,1,3]
    d.addLast(4);// [2,1,3,4]

    // returns the first element of the deque
    System.out.println(d.getFirst());//2

    // returns the last element of deque
    System.out.println(d.getLast());//4

    // removes the first element
    d.removeFirst();//[1,3,4]

    //removes the last element
    d.removeLast();//[1,3]

    //returns the size of deque
    System.out.println(d.size());//2

    // returns true if deque is empty
    if(d.isEmpty())
    {
      System.out.println("Deque is Empty");
    }







  }
}
