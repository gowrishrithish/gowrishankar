import java.util.*;
public class boredlol {
    public static void main(String[] args){
        Scanner sin = new Scanner(System.in);
        String sWord = sin.next();
        while(sWord.length()>1){
            System.out.print(sWord.charAt(1));
            System.out.print(sWord.charAt(0));
            sWord = sWord.substring(2);
        }
        System.out.println(sWord);
    }
}


