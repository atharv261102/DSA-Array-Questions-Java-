/* Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.*/
public class CheckIfRotated{
    public static void main(String[] args) {
        int[] arr=new int[]{3,4,5,1,2};
        boolean isSorted=check(arr);
        if(isSorted){
            System.out.println("The array is sorted and rotated");
        }
        else System.out.println("The array is not sorted and rotated");
    }

    public static boolean check(int[] arr){
        int n=arr.length;
        int cnt=0;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]) cnt+=1;
        }
        if(cnt==1){
            if(arr[0]<arr[n-1]) cnt+=1;
        }
        return cnt<=1;
    }
}