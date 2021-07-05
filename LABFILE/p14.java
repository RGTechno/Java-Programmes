import java.util.Scanner;

public class p14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            int n;
            System.out.println("Enter the number of terms: ");
            n = sc.nextInt();
            int a0 = 0, a1 = 1;
            System.out.print(a0 + " " + a1);
            for (int i = 0; i < n; i++) {
                int a2 = a0 + a1;
                System.out.print(" " + a2 + " ");
                a0 = a1;
                a1 = a2;
            }
        } finally {
            sc.close();
        }
    }
}