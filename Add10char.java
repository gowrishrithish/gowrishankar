import java.util.Scanner;
public class Add10char {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []s=str.split(" ");
		int count=0;
		String alp="abcdefghijklmnopqrstuvwxyz";
		for( int i=0;i<4;i++)
		{
		char n=(char) str.charAt(i);
		int x=alp.indexOf(n)+11;
		char cc=alp.charAt(x-1);
		System.out.print(cc);
		}
		char cc1=' ';
		for( int i=0;i<4;i++)
		{
		
		if(i==0)
		{
		cc1=s[1].charAt(0);
		System.out.print(" "+cc1);
		}
		if(i==2)
		{
			char n=(char) s[1].charAt(1);
			int x=alp.indexOf(n)+10;
			System.out.print(alp.charAt(x));
		}
		if(i==3)
		{
			char n=(char) s[1].charAt(2);
			int x=alp.indexOf(n)+10;
			int mid=x-26;
			cc1=alp.charAt(mid);
			System.out.print(cc1);
		}
		if(i==3)
		{
			cc1=s[1].charAt(3);
			System.out.print(cc1);
		}
		}
		}

}
