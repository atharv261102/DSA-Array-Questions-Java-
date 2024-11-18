//Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. It is guaranteed that a valid subarray exists.

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray{
    public static void main(String[] args) {
        int[] arr=new int[]{10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println("The length of Longest Subarray with Sum K is: " + lenOfLongestSubarr(arr, k));
    }
    public static int lenOfLongestSubarr(int[] arr, int k) {
       int n=arr.length;
       int sum=0, maxLen=0;
       Map<Integer, Integer> mp=new HashMap<>();
       for(int i=0; i<n; i++){
           sum+=arr[i];
           if(sum==k){
               int len=i+1;
               if(maxLen<len) maxLen=len;
           }
           int num2=sum-k;
           if(mp.containsKey(num2)){
               int len=i-mp.get(num2);
               if(maxLen<len) maxLen=len;
           }
           if(!mp.containsKey(sum)) mp.put(sum, i);
       }
       return maxLen;
    }
}