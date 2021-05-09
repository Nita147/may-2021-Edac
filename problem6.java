 
 import java.util.Scanner;
 
 class problem6
{
public static void main (String args[])
{
 int a1[]= new int[5];
 Scanner sc= new Scanner(System.in);
 for(int i=0; i<=4; i++)
  {
  a1[i]=sc.nextInt();
  }
  int max=0;
  for(int i=0; i<=4; i++)
  {
  max=(a1[i]>max)?a1[i]:max;
  
	  
   }
   System.out.print( "max array element"+max);
  }
}  