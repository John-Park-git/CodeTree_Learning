import java.util.Scanner;
public class Main {
    public static int recursion(int n) {
        if(n==1) {
            return 0;
        }
        else if(n%2==0) {
            return recursion(n/2) + 1;
        }
        else {
            return recursion(n/3)+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(recursion(n));
    }
}