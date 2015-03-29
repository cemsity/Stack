public class IntStack implements StackIntADT
{
   // fields
   int[] stack;
   int pointer;
   
   // constructors
   public IntStack( int size)
   {
      stack = new int[size];
      pointer = -1; 
   }//end construct 1 
   
   public IntStack()
   {
      stack = new int[10];
      pointer = -1; 
   }//end construct default
   
   
   // stack class methods {NOT FINISHED}

   public void push(int element)  //pushes onto stack 
   {
      if (isFull())
      {
         System.out.println("stack is full");
      }
      else 
      {
         pointer++;
         stack[pointer] = element;
      }
   }//end push
   
   public int pop()   //popps from stack
   {
         int popped;
   
      if (!isEmpty())
      {
         pointer--;
         popped = stack[pointer];
      }//end if 
      else
      {
       popped = 0;
      }//end else
   
      return popped;
   }//end pop
   
   public int peek()  //looks at the top of the stack
   {
   if (!isEmpty())
   {
      return stack[pointer];
   }
   else 
   {
      return pointer;
   }
   }//end peek
   
   public boolean isEmpty()  // check emptyness
   {
   return pointer == -1;
   }
   
   public boolean isFull()  // check fullness
   {
   return pointer == stack.length;
   }
  
   public int size()  // chekcs size 
   {
   return pointer++;
   }

}//end class
