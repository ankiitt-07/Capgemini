package Day5;
import java.util.*;

public class MoveAllZerostoLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Corrected logic to move zeros to left
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                }
            }
        }

        // Corrected array printing
        System.out.println("Array after moving zeros to left:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

       
    }
}
