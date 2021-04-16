import java.util.Scanner;

public class Nicknames {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String nickname = sc.nextLine();
        String even = nickname.replaceAll("(.).", "$1");
        String odd = nickname.replaceAll(".(.)", "$1");
        if (even.matches("/[aeyiuo]/gi") && (odd.matches("/[^aeyiuo]/gi")))
        {
            System.out.println("YES");
        }
        else System.out.println("NO");

    }
}
