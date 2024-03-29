package base.sort;

public class MergeSort {

    public static void mergeSort(int[] array,int left,int right){
        if(right<=left) return;

        int mid =  (left + right) >> 1;

        mergeSort(array,left,mid);
        mergeSort(array,mid+1,right);
        merge(array,left,mid,right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
            int[] temp = new int[right-left+1];
            int i =  left,j=mid+1,k=0;
            while(i<=mid && j<=right){
                temp[k++] = array[i]<=array[j] ? array[i++]:array[j++];
            }
            while(i<=mid) temp[k++] = array[i++];
            while(j<=right)temp[k++] = array[j++];

            for(int p=0;p<temp.length;p++){
                array[left+p] = temp[p];
            }

    }
    public static void main(String[] args){
//       int[] array =  new int[]{6,5,9,0,1,11,20,19,3,4};
       int[] array =  new int[]{6,5,9};
        MergeSort.mergeSort(array,0,array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
