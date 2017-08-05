
import java.util.Scanner;
	public class Ipaddress {
	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("enter the String");
			String s1=in.nextLine();
			String s4="";
			String s6="";
			String s7="";
		   int n=s1.length();
		   if(n%3==0){
			for(int i=0;i<s1.length();i=i+3){
				String s2=s1.substring(i,i+3);
				    s4+=s2+".";
			}}System.out.println("["+"'"+s4+"'"+"]");
	     if(n%3==2)
	     {
		for(int i=0;i<s1.length()-2;i=i+3){
			String s5=s1.substring(i,i+3);
			 s6+=s5+".";
			}
		s7=s1.substring(s1.length()-2);
			
	  } 
	     System.out.println("["+"'"+s6+s7+"'"+"]");
	    }

}
