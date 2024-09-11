import java.util.*;

public class InsertionSort {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            insertionSort(arr,5);
        }
        public static void insertionSort(int[] arr,int n) {
            for(int i=0;i<n-1;i++) {
                for(int j=i+1;j>0;j--) {
                    if(arr[j]<arr[j-1]) {
                        swap(arr,j,j-1);

                    }
                    else if(arr[j]>=arr[j+1]){
                        break;
                    }
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("Sorted Array is: "+Arrays.toString(arr));
        }
        public static void swap(int[] arr,int i,int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}
