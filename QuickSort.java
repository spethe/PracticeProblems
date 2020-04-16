class QuickSort {
    public int[] sortArray(int[] nums) {
       quickSort(nums,0,nums.length -1);
       return nums;
    }
    
    private void quickSort(int[] a, int low, int high){
        if( low < high ){
            //Get Partition index to start D&C
            int pi = partition(a,low,high);
            quickSort(a,low,pi - 1);
            quickSort(a,pi+1,high);
        }
    }
    
    private int partition(int[] a, int low, int high){
        //Set Pivot as last element
        int pivot = a[high];
        int i = (low -1);
        for(int j=low;j<=high;j++){
            //If element smaller than pivot, then swap and increment pointers.
            if(a[j] < pivot){
                i++;
                swap(a,i,j);
            }
        }
        //Swap pivot with pivot index position and return pivot index.
        swap(a,i+1,high);
        return i+1;
    } 
    
    private void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
