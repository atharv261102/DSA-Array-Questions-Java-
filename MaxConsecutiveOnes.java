public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr=new int[]{1, 1, 1, 0, 1, 1};
        int maxOnes=findMaxConsecutiveOnes(arr);
        System.out.println(maxOnes);
    }

    public static int findMaxConsecutiveOnes(int[] arr){
        int maxCnt=0;
        int cnt=0;
        for(int it: arr){
            if(it==1){
                cnt+=1;
            }
            else{
                cnt=0;
            }
            maxCnt=Math.max(maxCnt, cnt);
        }
        return maxCnt;
    }
}
