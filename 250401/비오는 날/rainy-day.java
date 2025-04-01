import java.util.*;
class Weather {
    public String date;
    public String day;
    public String weather;

    Weather(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] data = new Weather[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            data[i] = new Weather(date, day, weather);
        }
        for(int i=0;i<n-1;i++) {
            if(Integer.parseInt((data[i].date.substring(0,4)))>Integer.parseInt((data[i+1].date.substring(0,4)))) {
                Weather temp = data[i];
                data[i] = data[i+1];
                data[i+1] = temp;
            }
            else if(Integer.parseInt((data[i].date.substring(0,4)))==Integer.parseInt((data[i+1].date.substring(0,4)))) {
                if(Integer.parseInt((data[i].date.substring(5,7)))>Integer.parseInt((data[i+1].date.substring(5,7)))) {
                    Weather temp = data[i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                }
                else if(Integer.parseInt((data[i].date.substring(5,7)))==Integer.parseInt((data[i+1].date.substring(5,7)))) {
                    if(Integer.parseInt((data[i].date.substring(8)))>Integer.parseInt((data[i+1].date.substring(8)))) {
                        Weather temp = data[i];
                        data[i] = data[i+1];
                        data[i+1] = temp;
                    }
                }
            }
        }
        for(int i=0;i<n;i++) {
            if(data[i].weather.equals("Rain")) {
                System.out.println(data[i].date + " " + data[i].day + " " + data[i].weather);
                return;
            }
        }

    }
}