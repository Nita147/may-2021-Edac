import java.util.Scanner;

class problem7
 {
   public static void main(String args[])
   {
      //Reading a double value form user
      Scanner sc = new Scanner(System.in);
	  
      System.out.println("Enter a double value: ");
      double d = sc.nextDouble();
	  
      //Converting the double value to byte
      byte by = (byte) d;
	  
      //Printing the result
      System.out.println("byte value: "+by);
   }
}