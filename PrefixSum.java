public class PrefixSum {
    public static void main(String ...args){
        int[] arr=new int[]{1, 2, 3, 4};
        int n=arr.length;
        int[] newArr=findPrefixSum(arr, n);
        for(int it:newArr) System.out.print(it + " ");
        System.out.println();
    }
    public static int[] findPrefixSum(int[] arr, int n){
        int[] ans=new int[n];
        ans[0]=arr[0];
        for(int i=1; i<n; i++){
            ans[i]=arr[i]+ans[i-1];
        }
        return ans;
    }
}
