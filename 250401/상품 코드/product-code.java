import java.util.Scanner;
class Product {
    public String id;
    public int code;
    Product(String id, int code) {
        this.id = id;
        this.code = code;
        System.out.println("product " + this.code + " is " + this.id);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        Product pd1 = new Product("codetree", 50);
        Product pd2 = new Product(id2, code2);
    }
}