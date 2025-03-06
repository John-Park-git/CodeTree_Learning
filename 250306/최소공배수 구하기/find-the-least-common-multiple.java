import java.util.Scanner;

public class Main {
    public static int leastCommonMultiple(int n, int m) {
        if(n<m) {
            for(int i=n;i<=n*m;i++) {
                if(i%n==0 && i%m==0)
                    return i;
            }
            return n*m;
        }
        else {
            for(int i=m;i<=n*m;i++) {
                if(i%m==0 && i%n==0)
                    return i;
            }
            return n*m;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        System.out.println(leastCommonMultiple(n, m));
    }
}