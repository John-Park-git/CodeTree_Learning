import java.util.Scanner;
public class Main {
    public static void recursion(int n) {
        if(n==0)
            return;
        System.out.print(n + " ");
        recursion(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        recursion(n);
    }
}