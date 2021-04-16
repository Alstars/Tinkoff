import java.util.Scanner;

public class TimeSystem {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t = sc.nextInt();
        int hour = b * c;
        int day = a * b * c;
        int hours = t % day / hour;
        int minutes = t % day % hour / c;
        int seconds = t % day % hour % c;


        System.out.println(hours + " " + minutes + " " + seconds);
    }
}
