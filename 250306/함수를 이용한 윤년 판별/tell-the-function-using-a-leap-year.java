import java.util.Scanner;

public class Main {
    public static boolean isYunYear(int n) {
        if(n%4==0) {
            if(n%100==0 && n%400!=0) {
                return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.
        System.out.println(isYunYear(y));
    }
}