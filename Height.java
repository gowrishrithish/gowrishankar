import java.util.Arrays;
import java.util.Scanner;
public class Height 
	{
	 public static void main(String[] args)
	 {
	  System.out.println("ENTER THE NUMBER OF STUDENTS: ");
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  double[] Arr=new double[n];
	  System.out.println("ENTER THE HEIGHTS: ");
	  for(int i=0;i<n;i++)
	   {
	     Arr[i]=s.nextDouble();
	    }
	  Arrays.sort(Arr);
	  System.out.println("<<<4th TALLEST HEIGT IS:  "+Arr[n-4]+"  >>>");
	  for(int i=1;i<=n;i++)
	     System.out.println("\n"+i+"th TALLEST HEIGHT IS:"+Arr[n-i]);
	 }
	}


