class HeapSort {
    public int[] sortArray(int[] nums) {
        int heapSize = nums.length;
        //Build Heap
        int mid = (int) ((nums.length/2) - 1);
        for(int i=mid; i>=0; i--){
            maxHeapify(nums,i,heapSize);
        }
        //Re-Initialize i to last index.
        int i = nums.length -1;
        while(i>0){
            //Swap first element with last as we know we have already built a max heap
            swap(nums,i,0);
            //Then again heapify
            maxHeapify(nums,0,i);
            i--;
        }
        return nums;
    }
    
    private void maxHeapify(int[] a, int i, int heapSize){
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        
        if(l < heapSize && a[l] > a[largest]){
            largest = l;
        }
        if(r < heapSize && a[r] > a[largest]){
            largest = r;
        }
        if(largest!=i){
            swap(a,i,largest);
            maxHeapify(a,largest,heapSize);
        }     
    }
    private void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
