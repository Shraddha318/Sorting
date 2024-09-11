import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        selection_sort(arr, 5);
        sort(arr, 5);
    }

    static void selection_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i; // Initialize the index of the minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j; // Update the index of the minimum element
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int max_idx = i; // Initialize the index of the maximum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max_idx]) {
                    max_idx = j; // Update the index of the maximum element
                }
            }
            // Swap the maximum element with the current position
            int temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));}
}