import java.util.Scanner;
public class Main {
    public static int calc(int a,int b) {
        int num=0;
        for(int i=a;i<=b;i++) {
            if(check1(i)) {
                if(check2(i)%2==0)
                    num++;
            }
        }
        return num;
    }
    public static boolean check1(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static int check2(int n) {
        int sum=0;
        while(n>0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        System.out.println(calc(a,b));
    }
}