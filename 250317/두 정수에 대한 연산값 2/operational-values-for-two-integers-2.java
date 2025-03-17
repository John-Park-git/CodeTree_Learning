import java.util.Scanner;
public class Main {
    public static void modify(Num n1, Num n2) {
        if(n1.num > n2.num) {
            n2.num +=10;
            n1.num *=2;
        }
        else if (n2.num>n1.num) {
            n2.num *=2;
            n1.num +=10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        Num n1 = new Num(a);
        Num n2 = new Num(b);
        modify(n1,n2);
        a = n1.num;
        b = n2.num;
        System.out.println(a + " " + b);
    }
}
class Num {
    public int num=0;
    public Num(int n) {
        this.num=n;
    }
}