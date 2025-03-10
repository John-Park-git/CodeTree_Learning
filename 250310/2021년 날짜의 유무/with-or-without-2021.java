import java.util.Scanner;
public class Main {
    public static boolean checkDate(int m, int d) {
        if(m>12 || m<1)
            return false;
        else if((m<=7 && m%2!=0) || (m>=8 && m%2==0)) {
            if(d>=1 && d<=31) {
                return true;
            }
            else
                return false;
        }
        else if(m!=2) {
            if(d>=1 && d<=30) {
                return true;
            }
            else    
                return false;
        }
        else if(m==2) {
            if(d>=1 && d<=28) {
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if(checkDate(m,d))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}