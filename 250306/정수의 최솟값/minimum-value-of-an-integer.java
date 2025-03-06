import java.util.Scanner;

public class Main {
    public static int Min(int a, int b, int c) {
        if(a>b) {
            if(b>c) {
                return c;
            }
            return b;
        }
        else {
            return (a>c)? c:a;
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.println(Min(a,b,c));
    }
}