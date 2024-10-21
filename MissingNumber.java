/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array. */

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr=new int[]{9,6,4,2,3,5,7,0,1};
        // int ans=brute(arr, arr.length);
        //  int ans=optimalFirst(arr, arr.length);
        int ans=optimalSecond(arr, arr.length);
        System.out.println("The missing no is: " + ans);

    }

    // public static int brute(int[] arr, int n){
    //     int[] hash=new int[n+1];
    //     for(int it: arr){
    //         hash[it]+=1;
    //     }
    //     for(int i=1; i<=n; i++){
    //         if(hash[i]==0) return i;
    //     }
    //     return -1;
    // }

    // public static int optimalFirst(int[] arr, int n){
    //     int idealSum=(n*(n+1))/2;
    //     int sum=0;
    //     for(int it: arr){
    //         sum+=it;
    //     }
    //     idealSum-=sum;
    //     return idealSum;
    // }


    public static int optimalSecond(int[] arr, int n){
        int xor=0;
        for(int i=0; i<n; i++){
            xor=xor^arr[i]^(i+1);
        }
        return xor;
    }
}
