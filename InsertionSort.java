public class InsertionSort {
    public static void main(String[] args) {
        int[] arr=new int[]{6, 4, 3, 1, 2, 5};
        System.out.print("Before sort: ");
        for(int it: arr) System.out.print(it + " ");
        System.out.println();
        sortArray(arr, arr.length);
        System.out.print("After sort: ");
        for(int it: arr) System.out.print(it + " ");
        System.out.println();
    }

    public static void sortArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j-=1;
            }
        }
    }
}
