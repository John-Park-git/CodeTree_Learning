import java.util.*;
class Infor {
    public String name;
    public String address;
    public String region;

    Infor(String name, String address, String region) {
        this.name =name;
        this.address = address;
        this.region = region;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        Infor[] info = new Infor[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
            info[i] = new Infor(names[i],addresses[i],regions[i]);
        }
        Arrays.sort(info, (a,b)->a.name.compareTo(b.name));
        // Please write your code here.        
        System.out.println("name " + info[n-1].name);
        System.out.println("addr " + info[n-1].address);
        System.out.println("city " + info[n-1].region);

        
    }
}