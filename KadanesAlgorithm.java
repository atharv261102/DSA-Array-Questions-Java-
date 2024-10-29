public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int maxSum=new KadanesAlgorithm().maxSubArraySum(arr);
        System.out.println(maxSum);
    }

    public int maxSubArraySum(int[] arr){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            maxSum=Integer.max(maxSum, sum);
            if(sum<0) sum=0;
        }
        return maxSum;
    }
}
