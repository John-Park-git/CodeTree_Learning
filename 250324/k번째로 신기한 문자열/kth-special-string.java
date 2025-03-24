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
            char[] test = words[i].toCharArray();
            char[] test2 = t.toCharArray();
            int check=0;
            for(int j=0;j<test2.length;j++) {
                if(test2[j]==test[j]) {
                    ++check;
                    if(check==test2.length) {
                        friend[f] = words[i];
                        ++f;
                    }
                }
            }
        }
        String[] cpFriend = Arrays.copyOf(friend, f);
        Arrays.sort(cpFriend);

        System.out.println(cpFriend[k-1]);
    }
}