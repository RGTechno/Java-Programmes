import java.util.Arrays;
import java.util.Scanner;

public class p3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            int n;
            System.out.println("Enter no. of Strings: ");
            n = sc.nextInt();
            String[] stringArray = new String[n];
            System.out.println("Enter " + n + " Strings:");
            for (int i = 0; i < n; i++) {
                stringArray[i] = sc.nextLine();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (stringArray[i].compareTo(stringArray[j]) > 0) {
                        String temp = stringArray[i];
                        stringArray[i] = stringArray[j];
                        stringArray[j] = temp;
                    }
                }
            }
            System.out.println("Sorted String Array is: ");
            System.out.println(Arrays.toString(stringArray));
        } finally {
            sc.close();
        }
    }
}