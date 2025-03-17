import java.util.Scanner;
public class Main {
    public static void palindrome(String str) {
        for(int i=0;i<(str.length()/2);i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        palindrome(input);
    }
}