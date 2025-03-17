import java.util.Scanner;
public class Main {
    public static String text, pattern;

    public static int findIndex() {
        int chk=0;
        for(int i=0;i<text.length();i++) {
            if(i<text.length()-1) {
                for(int j=0;j<pattern.length();j++) {
                    if(i+j<text.length()-1) {
                        if(text.charAt(i+j)!=pattern.charAt(j))
                            chk=-1;
                        else
                            chk=i;
                    }
                }
            }
        }
        return chk;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();
        // Please write your code here.
        System.out.println(findIndex());
    }
}