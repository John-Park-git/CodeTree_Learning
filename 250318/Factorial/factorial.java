import java.util.Scanner;

public class Main {
    public static int Factorial(int n) {
        if(n==1)
            return 1;
        return Factorial(n-1)*n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(Factorial(n));
    }
}