import java.util.Scanner;
public class Main {
    public static int[] arr;
    public static void func(int a1, int a2) {
        int sum=0;
        for(int i=a1;i<=a2;i++) {
            sum += arr[i-1];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            func(a1,a2);
        }
    }
}