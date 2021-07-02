package base.sort;

public class QuickSort {
    public static void quickSort(int arr[],int begin,int end){
        if(end<=begin) return;
        int pivot = partition(arr,begin,end);
        quickSort(arr,begin,pivot);
        quickSort(arr,pivot+1,end);
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = end,counter = begin;
        for(int i =begin;i<end;i++){
            if(arr[i] < arr[pivot]){
                int temp = arr[counter];arr[counter] = arr[i];arr[i]=temp;
                counter++;
            }

        }
        int temp = arr[pivot];arr[pivot] = arr[counter];arr[counter]=temp;
        return counter;
    }
}
