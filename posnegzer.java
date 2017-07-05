package pnz;
import java.util.*;
public class posnegzer {
	    public static void main(String []s)
	    {
	        int num;
	        Scanner sc=new Scanner(System.in);
	         
	        System.out.print("Enter any of the  integer number: ");
	        num=sc.nextInt();
	        if(num>0)
	            System.out.println(num + " is positive number.");
	        else if(num<0)
	            System.out.println(num + " is negative number.");
	        else
	            System.out.println("it's zero.");
	         
	    }
	}


