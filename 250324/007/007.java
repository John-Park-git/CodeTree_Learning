import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode;
        char mPoint;
        int time;
        // Please write your code here.
        sCode = sc.next();
        mPoint = sc.next().charAt(0);
        time = sc.nextInt();
        Secret sec = new Secret(sCode, mPoint, time);
        sec.Print();
    }
}
class Secret {
        private String sCode;
        private char mPoint;
        private int time;

        public Secret(String sCode, char mPoint, int time) {
            this.sCode = sCode;
            this.mPoint = mPoint;
            this.time = time;
        }

        public void Print() {
            System.out.println("secret code : " + sCode);
            System.out.println("meeting point : " + mPoint);
            System.out.println("time : " + time);
        }
    }