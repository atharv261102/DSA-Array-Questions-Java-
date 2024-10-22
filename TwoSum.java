import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr=new int[]{2,7,11,15};
        int target=9;
        int[] ans=twoSum(arr, target);
        for(int it:ans){
            System.out.println(it);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp=new HashMap<Integer, Integer>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            int num1=nums[i];
            int num2=target-num1;
            if(mp.get(num2)!=null) return new int[]{i, mp.get(num2)};
            if(mp.get(num1)==null) mp.put(num1, i);
        }
        return null; 
    }
}
