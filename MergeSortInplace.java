import java.util.Arrays;

public class MergeSortInplace {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        mergeSort(arr, 0, arr.length );
        System.out.println(Arrays.toString(arr));


    }
    public static void mergeSort(int[] arr,int s,int e) {
        if(e-s == 1 )return;
        int mid=s+(e-s)/2;
        mergeSort(arr,0,mid);
        mergeSort(arr,mid,e);
        merge(arr,s,mid,e);

    }
    public static void merge(int[] arr,int s,int m,int e) {
        int[] temp=new int[e-s];
        int i=s,j=m,k=0;
        while(i<m&& j<e) {
            if(arr[i]<arr[j]) {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l< temp.length;l++){
            arr[s+l]=temp[l];
        }

    }
}
