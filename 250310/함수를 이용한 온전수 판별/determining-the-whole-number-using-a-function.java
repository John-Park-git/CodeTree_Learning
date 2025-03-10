import java.util.Scanner;
public class Main {
    public static int calc(int a, int b) {
        int num=0;
        for(int i=a;i<=b;i++) {
            if(check(i))
                num++;
        }
        return num;
    }
    public static boolean check(int n) {
        if(n%2==0)
            return false;
        else if(n%10==5)
            return false;
        else if(n%3==0 && n%9!=0)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calc(a,b));
    }
}