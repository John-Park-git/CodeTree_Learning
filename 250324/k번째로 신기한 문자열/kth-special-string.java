import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        String[] friend = new String[n];

        int f=0;
        for(int i=0;i<n;i++) {
            if(words[i].contains(t)) {
                friend[f]=words[i];
                f++;
            }
        }
        String[] cpFriend = Arrays.copyOf(friend, f);
        Arrays.sort(cpFriend);

        System.out.println(cpFriend[k-1]);
    }
}