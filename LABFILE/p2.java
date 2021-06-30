import java.util.Scanner;

public class p2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        try {
            int size;

            System.out.println("Enter the size of array: ");

            size = sc.nextInt();

            int[] arr = new int[size];
            System.out.println("Enter Array Elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Sorted ARRAY: ");
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i] + " ");
            }
        } finally {
            sc.close();
        }

    }
}