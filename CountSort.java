import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {1,9,2,3,3,2,1,4,5,5,3,2,12};
        countSort(arr);

    }
    public static void countSort(int[] arr) {
        int max=arr[0];
        if(arr==null || arr.length<=1 ) return;
        for(int i=0;i<arr.length;i++) {
            if(max<arr[i]) {
                max=arr[i];
            }
        }
        int[] freq=new int[max+1];
        for(int i=0;i<arr.length;i++) {
            freq[arr[i]]++;
        }
        int index=0;
        System.out.println("Frequency Array: "+Arrays.toString(freq));
        for(int i=0;i<freq.length;i++) {
            while(freq[i]>0) {
                arr[index++]=i;
                freq[i]--;
            }
        }
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
