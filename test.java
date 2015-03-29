public class test
{
   public static void main(String[] args)
   {
   IntStack s = new IntStack(5);
   for (int j=0; j<6; j++)
   {
      s.push(j);
      System.out.println(s.peek());
    
   }
   }//end main function
   
   
}