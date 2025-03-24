import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cap = (n%2!=0)? n:n-1;
        int [] mid = new int[cap];
        int used = 0;

        for(int i=0;i<n;i++) {
            mid[used++]=arr[i];
            if((i+1)%2!=0) {
                Arrays.sort(mid, 0, used);
                System.out.print(mid[used/2] + " ");
            }
        }     
        // Please write your code here.
    }
}