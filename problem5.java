import java.util.Scanner;

class problem5
 {
   public static void main(String args[])
   {
    Scanner sc= new Scanner(System.in);
	int arr[]=new int[6];
	for(int i=0; i<6; i++)
	{
	 arr[i]=sc.nextInt();
	 }
	 System.out.println("array element in  order:");
	 for(int i=0; i<6; i++)
	{
	
	 System.out.print("  "+arr[i]);
	 }
	 	 System.out.println();
		  System.out.println("array element in reverse order:");
	 for(int i=5; i>=0; i--)
	 {
	
	 System.out.print("  "+arr[i]);
	 }
	 }
	 }