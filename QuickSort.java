public class QuickSort {
    public static void main(String[] args) {
        int[] arr=new int[]{2, 1, 3, 4, 5, 7, 6};
        sortArray(arr, arr.length);
        for(int it: arr) System.out.print(it + " ");
        System.out.println();
    }

    public static void sortArray(int[] arr, int n){
        int low=0, high=n-1;
        qs(arr, low, high);
    }

    public static void qs(int[] arr, int l, int h){
        if(l<h){
        int partIndex=findPivot(arr, l, h);
        qs(arr, l, partIndex-1);
        qs(arr, partIndex+1, h);
        }
        return;
    }

    public static int findPivot(int[] arr, int l, int h){
        int i=l, j=h, pivot=arr[l];
        while(i<j){
            while(arr[i]<=pivot && i<h) i+=1;
            while(arr[j]>pivot && j>l) j-=1;
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[l];
        arr[l]=temp;
        return j;
    }
}
