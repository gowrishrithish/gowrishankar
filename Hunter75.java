
	import java.util.Scanner;
   public class Hunter75 {  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element u want to remove : ");
		int b=sc.nextInt();
		System.out.println("Enter the array values : ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int[] c=new int[a.length];
		for(int i=0;i<n;i++) {
			if(a[i]!=b) {
				c[i]=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(c[i]>0)
			System.out.println(c[i]);
		System.out.println(c[i]);
	}
	}

}
