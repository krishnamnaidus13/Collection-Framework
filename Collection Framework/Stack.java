import java.util.*;
import java.lang.*;
import java.io.*;

class Stack
{
  public static void main(String[] args)
  {

    /*
    --> Stack is a part of collection framework.
    --> Last In First Out(LIFO)
    --> Rich Library

    Frequently used methods are:
    1. push()
    2. pop()
    3. size()
    4. isEmpty()
    5. peek()

    */

    //Declaration
    Stack<Integer> st = new Stack<Integer>();
    //                   or
    //ArrayDeque<Integer> st = new ArrayDeque<Integer>();


    // isEmpty() method checks whether stack is empty or not
    if(st.isEmpty())
    {
      System.out.println("Stack is Empty");
    }

    //push method pushes elements into stack
    for(int i=0;i<10;i++)
    {
      st.push(i);
    }


    //peek() method returns top element of stack
    System.out.println(st.peek());


    // pop() method removes top element of stack
    for(int i=0;i<5;i++)
    {
      st.pop();
    }

    //peek() method returns top element of stack
    System.out.println(st.peek());

    //size() method returns size of the stack
    System.out.println(st.size());

  }
}
