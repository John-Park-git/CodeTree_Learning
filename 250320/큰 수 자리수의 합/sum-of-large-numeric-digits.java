import java.util.Scanner;
public class Main {
    public static int Multiple(int n) {
        if(n<10)
            return n;
        return Multiple(n/10)+Multiple(n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.println(Multiple(a*b*c));
    }
}