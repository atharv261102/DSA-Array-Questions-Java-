import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr=new int[]{4,1,2,1,2};
        // int single=brute(arr);
        int single=optimal(arr);
        System.out.println(single);
    }

    public static int optimal(int[] arr){
        int xor=0;
        for(int it: arr) xor=xor^it;
        return xor;
    }

    // public static int brute(int[] arr){
    //     int n=arr.length;
    //     Arrays.sort(arr);
    //     if(arr.length==1) return arr[0];
    //     if(arr[0]!=arr[1]) return arr[0];
    //     if(arr[n-1]!=arr[n-2]) return arr[n-1];
    //     for(int i=1; i<n-1; i++){
    //         if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]) return arr[i];
    //     }
    //     return -1;
    // }
}
