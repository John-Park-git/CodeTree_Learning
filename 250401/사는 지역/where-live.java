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
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
        }
        // Please write your code here.
        for(int i=0;i<n-1;i++) {
            if(names[i].compareTo(names[i+1])>0) {
                String temp1 = names[i];
                names[i] = names[i+1];
                names[i+1] = temp1;
                String temp2 = addresses[i];
                addresses[i] = addresses[i+1];
                addresses[i+1] = temp2;
                String temp3 = regions[i];
                regions[i] = regions[i+1];
                regions[i+1] = temp3;
            }
        }
        Infor[] info = new Infor[n];
        for (int i = 0; i < n; i++) {
            info[i] = new Infor(names[i],addresses[i],regions[i]);
        }
        System.out.println("name " + info[n-1].name);
        System.out.println("addr " + info[n-1].address);
        System.out.println("city " + info[n-1].region);

        
    }
}