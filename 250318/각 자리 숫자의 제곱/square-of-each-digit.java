import java.util.Scanner;
public class Main {
    public static int plusSquare(int n) {
        if(n<10)
            return n*n;

        return plusSquare(n/10)+plusSquare(n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(plusSquare(n));
    }
}