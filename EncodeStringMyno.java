
import java.util.Scanner;
public class EncodeStringMyno {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input1 = scan.next();
		String input2 = scan.next();
		if (input1.matches(".*[0-9].*") || input2.matches(".*[0-9].*")) {
			System.out.println("Cannot be manipulated!!!");
		} else {
			char[] ch = input1.toCharArray();
			char[] ch1 = input2.toCharArray();
			int a1[] = new int[ch1.length];
			int a[] = new int[ch.length];
			if (input1 != null) {
				for (int i = 0; i < ch.length; i++) {
					a[i] = (int) ch[i] + 10;
					if (a[i] >= 123) {
						int temp = a[i] - 122;
						a[i] = 96 + temp;
					}
					ch[i] = (char) a[i];
				}
			}
			if (input2 != null) {
				for (int i = 0; i < ch1.length; i++) {
					if (i == 0 || i == ch1.length - 1) {
						continue;
					} else {
						a1[i] = (int) ch1[i] + 10;
						if (a1[i] >= 123) {
							int temp = a1[i] - 122;
							a1[i] = 96 + temp;
						}
						ch1[i] = (char) a1[i];
					}
				}
			}
			System.out.print(ch);
			System.out.print(" ");
			System.out.println(ch1);
			scan.close();
		}
	}
}