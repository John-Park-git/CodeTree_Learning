import java.util.Scanner;
public class Main {
    public static int checkNum(int a, int b) {
        int cnt=0;
        for(int i=a;i<=b;i++) {
            if(checkCondition1(i) || checkCondition2(i))
                cnt++;
        }
        return cnt;
    }
    public static boolean checkCondition1(int n) {
        return n%3==0;
    }
    public static boolean checkCondition2(int n) {
        if(n<10 && (n == 3 || n == 6 || n == 9))
                return true;
        if(n<100 && (n%10 == 3 || n%10 == 6 || n%10 == 9))
                return true;
        for(int i=10;i<=100000;i*=10) {
            if(n/i == 3 || n/i == 6 || n/i == 9 )
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        System.out.println(checkNum(A,B));
    }
}