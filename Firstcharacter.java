
	package player;
	import java.util.Scanner;
	public class Firstcharacter {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.out.println("Enter the String");
	Scanner s=new Scanner(System.in);
	String a=s.next();
	String result="";
	char firstChar=a.charAt(0);
	result=result+Character.toUpperCase(firstChar);
	for (int i=0;i<a.length();i++){
		char currentChar=a.charAt(i);
		char perviousChar=a.charAt(i-1);
		if(perviousChar==' '){
			result=result+Character.toUpperCase(currentChar);
		}
		else{
			result=result+currentChar;
		}
	System.out.println(result);
		}

		
		}
	

}
