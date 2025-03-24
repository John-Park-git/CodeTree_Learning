import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(nums);

        int max=nums[0]+nums[2*n-1];
        for (int i = 0; i < n; i++) {
            int sum = nums[i]+nums[2*n-1-i];
            if(max<sum) {
                max=sum;
            }
        }
        System.out.println(max);
    }
}