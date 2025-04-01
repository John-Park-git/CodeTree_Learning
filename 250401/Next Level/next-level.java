import java.util.Scanner;

class User {
    public String id;
    public int level;

    User(String id, int level) {
        this.id = id;
        this.level = level;
        System.out.println("user " + this.id+" " +"lv " +this.level);
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        User usr1 = new User("codetree", 10);

        User usr2 = new User(id, level);
    }
}