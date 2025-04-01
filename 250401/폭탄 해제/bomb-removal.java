import java.util.Scanner;
class Bomb {
    public String Ucode;
    public char lColor;
    public int time;

    Bomb(String Ucode, char lColor, int time) {
        this.Ucode = Ucode;
        this.lColor =lColor;
        this.time = time;
        System.out.println("code : " + this.Ucode);
        System.out.println("color : " + this.lColor);
        System.out.println("second : " + this.time);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        Bomb bmb = new Bomb(uCode,lColor,time);
    }
}