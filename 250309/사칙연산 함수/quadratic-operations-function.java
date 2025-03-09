import java.util.Scanner;
public class Main {
    public static void plus(int a, char o, int c) {
            System.out.println(a + " + " + c + " = " + (a+c));
    }
    public static void minus(int a, char o, int c) {
            System.out.println(a + " - " + c + " = " + (a-c));
    }
    public static void product(int a, char o, int c) {
            System.out.println(a + " * " + c + " = " + (a*c));
    }
    public static void divide(int a, char o, int c) {
            System.out.println(a + " / " + c + " = " + (a/c)); 
    }
    public static void calc(int a, char o, int c) {
        if(o!='+' && o!='-' && o!='*' && o!='/') {
            System.out.println("False");
        }
        if(o=='+') 
            plus(a,o,c);
        
        else if(o=='-') 
            minus(a,o,c);
        
        else if(o=='*') 
            product(a,o,c);
    
        else if(o=='/') 
            divide(a,o,c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        calc(a,o,c);
    }
}