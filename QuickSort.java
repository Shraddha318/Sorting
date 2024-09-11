import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr)); // Print the sorted array once
    }
    public static void sort(int[] arr, int low, int high) {
        if (low >= high) return;
        int s = low;
        int e = high;
        int mid = (s + e) / 2;
        int pivot = arr[mid];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        System.out.println("Subarray after partition: " + Arrays.toString(Arrays.copyOfRange(arr, low, high + 1)));
        sort(arr, low, e);
        sort(arr, s, high);
    }
}
