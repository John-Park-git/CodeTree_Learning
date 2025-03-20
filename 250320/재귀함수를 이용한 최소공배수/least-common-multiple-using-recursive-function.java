import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
            if(b==0)
                return a;

            return gcd(b, a%b);
    }
    
    public static int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }

    public static int findLcm(int[] arr, int index) {
        if(index == arr.length-1)
            return arr[index];

        return lcm(arr[index], findLcm(arr,index+1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(findLcm(arr,0));
    }
}