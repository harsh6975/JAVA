import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        int arr[] = new int[5];

        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();
            int arr1[] = new int[size];
            for (int i = 0; i < 5; i++) {
                arr[i] = i;
                arr1[i] = i + 1;
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(arr[i]);
            }

            for (int i = 0; i < size; i++) {
                System.out.println(arr1[i]);
            }
        }

        int arr2[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
