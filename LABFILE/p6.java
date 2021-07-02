import java.util.Scanner;

public class p6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            int n;
            System.out.println("INPUT AN INTEGER: ");
            n = sc.nextInt();
            float nd = (float) (n);
            System.out.println("Float of " + n + " is " + nd);
        } finally {
            sc.close();
        }
    }
}