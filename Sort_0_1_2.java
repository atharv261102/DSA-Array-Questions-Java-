//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

//APPLYING DUTCH NATIONAL FLAG ALGORITHM
public class Sort_0_1_2 {
    public static void main(String[] args) {
        int[] arr=new int[]{2,0,2,1,1,0};
        optimalApproach(arr);
        for(int it: arr){
            System.out.print(it + " ");
        }
        System.out.println();
    }
    public static void optimalApproach(int[] arr){
        //APPLYING DUTCH NATIONAL FLAG ALGORITHM
        int l=0, m=0, h=arr.length-1;
        while(m<=h){
            if(arr[m]==0){
                int temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                l+=1;
                m+=1;
            }
            else if(arr[m]==1) m+=1;
            else{
                int temp=arr[m];
                arr[m]=arr[h];
                arr[h]=temp;
                h-=1;
            }
        }
    }
}
