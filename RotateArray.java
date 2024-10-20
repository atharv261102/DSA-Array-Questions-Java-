/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative. */
public class RotateArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7};  //o/p: {5,6,7,1,2,3,4}
        int n=arr.length;
        int k=3;
        k=k%n;
        // brute(arr, n, k);    
        // for(int it: arr) System.out.print(it + " ");  
        optimal(arr, n, k);
        for(int it: arr) System.out.print(it + " ");  
    }

    // public static void brute(int[] arr, int n, int k){
    //     int[] temp=new int[n];
    //     for(int i=0; i<n; i++){
    //         if(i<k){
    //             temp[i]=arr[n-(k-i)];
    //         }
    //         else{
    //             temp[i]=arr[i-k];
    //         }
    //     }
    //     for(int i=0; i<n; i++) arr[i]=temp[i];
    // }

    public static void optimal(int[] arr, int n, int k){
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    public static void reverse(int[] arr, int s, int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
        }
    }
}
