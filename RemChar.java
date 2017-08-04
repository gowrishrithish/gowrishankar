
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	public class RemChar {
		public static void main(String args[]) throws IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1;
		char c;
		String a="";
		System.out.println("Enter the String");
		s1=br.readLine();
		int l=s1.length();
		for(int i=0;i<l;i++)
		{
			c=s1.charAt(i);
			if(c!=' ')
				a=a+c;
			s1=s1.replace(c, ' ');
			}
		System.out.println(a);
		}
	

}
