import java.util.Scanner;
public class Main {
    public static void func(int n) {
        int now=1;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(now>9)
                    now=1;
                System.out.print(now);
                System.out.print(" ");
                ++now;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        func(n);
    }
}