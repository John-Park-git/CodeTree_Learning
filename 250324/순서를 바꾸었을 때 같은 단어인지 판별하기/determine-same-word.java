import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        word1 = String.valueOf(chars1);
        word2 = String.valueOf(chars2);
        
        if(word1.equals(word2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
        /*if(chars1.length!=chars2.length)
            System.out.println("No");
        else {
            for(int i=0;i<chars1.length;i++) {
                if(chars1[i]!=chars2[i]) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        */
        