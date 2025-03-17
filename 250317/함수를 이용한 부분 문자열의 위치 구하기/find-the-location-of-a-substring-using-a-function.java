import java.util.Scanner;
public class Main {
    public static String text, pattern;

    public static boolean check(int i) {
        if((i+pattern.length()-1)>=text.length())
            return false;
        for(int j=0;j<pattern.length();j++) {
            if(text.charAt(i+j)!=pattern.charAt(j))
                return false;
        }
        return true;

    }
    public static int findIndex() {
        for(int i=0;i<text.length();i++) {
            if(check(i))
                return i;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();
        // Please write your code here.
        System.out.println(findIndex());
    }
}