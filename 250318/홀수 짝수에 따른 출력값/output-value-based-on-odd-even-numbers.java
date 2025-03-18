import java.util.Scanner;

public class Main {
    public static int plus(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(n%2==0) {
            return plus(n-2)+n;
        }
        else {
            return plus(n-2)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(plus(n));
    }
}