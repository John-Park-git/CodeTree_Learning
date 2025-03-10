import java.util.Scanner;
public class Main {
    public static boolean checkYun(int y) {
        if(y%4==0) {
            if(y%100==0 && y%400!=0) {
                return false;
            }
            return true;
        }
        return false;
    }
    public static int checkSeason(int m) {
        if(m>=3 && m<=5) {
            return 1;
            //spring
        }
        else if(m>=6&&m<=8) {
            return 2;
            //summer
        }
        else if(m>=9 && m<=11) {
            return 3;
            //fall
        }
        else if(m==12 || m<=2) {
            return 4;
            //winter
        }
        else
            return -1;
    }
    public static boolean checkDate(int y, int m, int d) {
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
            if(checkYun(y)) {
                if(d>=1 && d<=29)
                    return true;
                else 
                    return false;
            }
            else if(d>=1 && d<=28) {
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
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if(checkDate(y,m,d)) {
            switch(checkSeason(m)) {
                case 1:
                    System.out.println("Spring");
                    break;
                case 2:
                    System.out.println("Summer");
                    break;
                case 3:
                    System.out.println("Fall");
                    break;
                case 4:
                    System.out.println("Winter");
                    break;
                default:
                    System.out.println("-1");
            }
        }
        else
            System.out.println("-1");
    }
}