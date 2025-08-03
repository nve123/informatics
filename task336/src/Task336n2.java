import java.util.Scanner;

public class Task336n2 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int d = in.nextInt();
            int c = 0;
            if (d > 9) return;
            for (int i = 0;; i++) {
                if (n == 0) break;
                if (n % 10 == d) {
                    c++;
                }
                n /= 10;
            }
            System.out.println(c);
    }
}