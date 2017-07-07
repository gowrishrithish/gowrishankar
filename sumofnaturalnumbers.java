import java.util.Scanner;
public class sumofnaturalnumbers {
public static void main(String[] args) {  
	  int inputNumber;  
      int sum;  
      Scanner scanner = new Scanner(System.in);  
      System.out.println("Please enter the number :");  
      inputNumber = scanner.nextInt();  
      scanner.close();  
      sum = (inputNumber * (inputNumber+1))/2;       
      System.out.println("The sum of "+inputNumber+" natural numbers is "+sum);  

  }
}


