import java.util.Scanner;
class Num {
            public int number;
            public Num(int n) {
                this.number = n;
            }
}

public class Main {
    public static void modify(Num n, Num m) {
        int temp = n.number;
        n.number = m.number;
        m.number = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        Num n1 = new Num(n);
        Num n2 = new Num(m);
        modify(n1,n2);
        System.out.println(n1.number +" "+n2.number);
    }
}