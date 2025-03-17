import java.util.Scanner;

public class Main {
    public static void modify(Num n1, Num n2) {
        if(n1.num > n2.num) {
            n1.num +=25;
            n2.num *=2;
        }
        else if(n2.num>n1.num) {
            n1.num *=2;
            n2.num += 25;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        Num num1 = new Num(a);
        Num num2 = new Num(b);
        modify(num1,num2);
        a = num1.num;
        b = num2.num;
        System.out.println(a + " " + b);
    }
}
class Num {
        public int num;
        public Num(int n) {
            this.num = n;
        }
    }