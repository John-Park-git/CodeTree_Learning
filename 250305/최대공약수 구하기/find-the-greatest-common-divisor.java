import java.util.Scanner;

public class Main {
    public static int calc(int n, int m) {
        int result=1;
        if(n>m) {
            for(int i=1;i<=m;i++) {
                if(m%i==0 && n%i==0) {
                    result = i;
                }
            }
        }
        else {
            for(int i=1;i<=n;i++) {
                if(m%i==0 && n%i==0) {
                    result = i;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        System.out.print(calc(n,m));
    }
}