public class IntStack implements StackIntADT
{
   // fields
   private int[] stack;
   private int pointer, size;
   
   // constructors
   public IntStack( int sizes)
   {
      stack = new int[sizes];
      pointer = -1; 
      size = sizes;
   }//end construct 1 
   
   public IntStack()
   {
      stack = new int[10];
      pointer = -1; 
      size = 10;
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
         
         popped = stack[pointer];
         pointer--;
      }//end if 
      else
      {
       System.out.println("Stack is Empty");
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
   return pointer == (size - 1);
   }
  
   public int size()  // chekcs size 
   {
   return pointer++;
   }

}//end class
