import java.util.Scanner;
public class Main {
    public static boolean check(int[] a, int[] b) {
        for(int i=0;i<a.length;i++) {
            if(a[i]==b[0]) {
                for(int j=1;j<b.length;j++) {
                    if(i>=a.length-1)
                        return false;
                    else if(a[i+j]!=b[j])
                        return false;
                    else 
                        continue;
                }
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        if(check(a,b))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}