import java.util.*;
class Agent {
    public String name="";
    public int score=0;

    Agent(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        Agent[] arr = new Agent[5];
        for(int i=0;i<5;i++) {
            String name = sc.next();
            int score = sc.nextInt();
            arr[i] = new Agent(name, score);
        }
        Arrays.sort(arr, (a,b) -> Integer.compare(a.score , b.score));
        System.out.println(arr[0].name+" "+arr[0].score);


        
    }
}