import java.util.Scanner;
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
        for(int i=0;i<4;i++) {
            if(arr[i].score < arr[i+1].score) {
                Agent temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp; 
            }
        }
        System.out.println(arr[4].name+" "+arr[4].score);


        
    }
}