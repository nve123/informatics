import java.util.Scanner;

public class Task336n2 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int d = in.nextInt();
            int c = 0;
            if (d > 9) return;
            for (;n > 0; n /= 10) {
                if (n % 10 == d) {
                    c++;
                }
            }
            System.out.println(c);
    }
}