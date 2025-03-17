import java.util.Scanner;
public class Main {
    public static int m;
    public static int[] arr;

    public static int func() {
        int sum=0;
        while(m>=1) {
            if(m%2!=0) {
                sum += arr[m];
                m--;
            }
            else {
                sum += arr[m];
                m/=2;
            }
        
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n+1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(func());
    }
}