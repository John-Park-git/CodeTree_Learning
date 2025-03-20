import java.util.Scanner;
public class Main {
    public static int count = 0;
    public static void recursion(int n) {
            if(n==1)
                return;
            if(n%2==0) {
                count++;
                recursion(n/2);
            }
            else {
                count++;
                recursion(3*n+1);
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        recursion(n);
        System.out.println(count);
    }
}