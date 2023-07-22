import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s <= 1) return;

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);


        mergeInPlace(arr, s, mid, e);
    }

    static void mergeInPlace(int[] arr, int s, int m, int e){

        int[] fin = new int[e-s];

        int i = s, j = m, k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                fin[k] = arr[i];
                i++;
                k++;
            }
            else{
                fin[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i < m){
            fin[k] = arr[i];
            i++;
            k++;
        }

        while(j < e){
            fin[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0; l < fin.length; l++) {
            arr[s+l] = fin[l];
        }

//        System.out.println(Arrays.toString(fin));
    }
}
