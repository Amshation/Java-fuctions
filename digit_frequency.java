
     
     import java.util.*;

public class digit_frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
       System.out.println("enter your digit");
        int d = sc.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int f = 0;

        while (n > 0) {
            int cd = n % 10;
            n = n / 10;

            if (cd == d) {
                f++;
            }
        }

        return f;
    }
}                        
                                