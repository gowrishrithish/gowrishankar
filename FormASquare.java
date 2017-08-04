

	import java.util.Scanner;

	public class FormASquare {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int a[]=new int[8];
			for(int i=0;i<8;i++){
				a[i]=s.nextInt();
			}
			int x=Math.abs(a[1]-a[3]);
			int y=Math.abs(a[2]-a[4]);
			int z=Math.abs(a[5]-a[7]);
			int z2=Math.abs(a[6]-a[0]);
			s.close();
			if(x==y&&x==z&&x==z2){
				System.out.println("It forms a square");
			}
				else{
					System.out.println("It does not form a square");
				}
		}

}
