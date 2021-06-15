import java.util.*;
import java.lang.*;
import java.io.*;

class Queue
{
  public static void main(String[] args)
  {

    /*
    --> Queue is a part of collection framework.
    --> First in First Out
    --> Rich Library

    Frequently used methods are:
    1. peek()
    2. offer()
    3. poll()
    4. element()
    5. add()
    6. remove()
    7. isEmpty()
    8  size()
    */

    //Declaration
    Queue<Integer> q= new LinkedList<Integer>();
    //             or
    //Queue<Integer> q= new ArrayDeque<Integer>();


    // offer() is used to insert elements.
    // This method does not throw an exception when the Queue capacity is full
    for(int i=0;i<10;i++)
    {
      q.offer(i);
    }


    // poll() is used to remove elements.
    // This method does not throw an exception when the Queue is empty
    for(int i=0;i<5;i++)
    {
      q.poll();
    }


    // peek() is used to return head of queue
    // This method does not throw an exception when the Queue is empty
    System.out.println(q.peek());

    //add() method is used to insert elements
    //Throws an exception when the capacity of Queue is full
    for(int i=0;i<10;i++)
    {
      q.add(i);
    }

    //remove() method removes the first element of queue
    //throws exception when the queue is empty
    for(int i=0;i<5;i++)
    {
      q.remove();
    }

    //element() returns the first element of queue
    //throws exception when the queue is empty
    System.out.println(q.element());

    //returns true if queue is empty
    if(q.isEmpty())
    {
      System.out.println("Queue is Empty");
    }

    //returns the size of queue
    System.out.println(q.size());


  }
}
