public class SelectionSort {
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
        for(int i=0; i<n-1; i++){
            int mini=i;
            for(int j=i; j<n; j++){
                if(arr[j]<=arr[mini]) mini=j;
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }
}
