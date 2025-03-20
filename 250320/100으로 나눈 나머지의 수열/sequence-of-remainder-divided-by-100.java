import java.util.Scanner;
public class Main {
    public static int recursion(int n) {
        if(n==1)
            return 2;
        if(n==2)
            return 4;
        return (recursion(n-1)*recursion(n-2))%100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(recursion(n));
    }
}