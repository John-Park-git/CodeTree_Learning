import java.util.Scanner;

public class Main {
    public static void modify(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<0) {
                arr[i] = Math.abs(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        modify(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}