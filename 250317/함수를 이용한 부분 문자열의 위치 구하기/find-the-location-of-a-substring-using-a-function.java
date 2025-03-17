import java.util.Scanner;
public class Main {
    public static int findIndex(String t, String p) {
        return (t.indexOf(p)!=-1)? t.indexOf(p):-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        // Please write your code here.
        System.out.println(findIndex(text, pattern));
    }
}