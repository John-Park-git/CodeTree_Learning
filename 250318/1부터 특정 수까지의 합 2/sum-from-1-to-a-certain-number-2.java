import java.util.Scanner;

public class Main {
    public static int plus(int n) {
        if(n==0)
            return 0;
        return plus(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(plus(n));
    }
}