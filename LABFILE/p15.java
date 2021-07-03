import java.util.Scanner;

public class p15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            int n;
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            int rem = 1;
            for (int i = 2; i <= n / 2; i++) {
                rem = n % i;
                if (rem == 0) {
                    break;
                }
            }
            if (rem == 0 || n == 1) {
                System.out.println(n + " is not a prime number");
            } else {
                System.out.println(n + " is a prime number");
            }
        } finally {
            sc.close();
        }
    }
}