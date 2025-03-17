import java.util.Scanner;
public class Main {
    public static void check(String str) {
        int cnt=0;
        for(int i=0;i<str.length();i++) {
            if(i!=str.length()-1 && str.charAt(i)!=str.charAt(i+1))
                cnt++;
        }
        if(cnt>0)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        check(A);
    }
}