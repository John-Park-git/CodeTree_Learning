import java.util.Scanner;
public class Main {
    public static int num=0;
    public static void recursion(int n) {
        if(n==1) {
            return;
        }
        else if(n%2==0) {
            num++;
            recursion(n/2);
        }
        else if(n%2!=0) {
            num++;
            recursion(n/3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        recursion(n);
        System.out.println(num);
    }
}