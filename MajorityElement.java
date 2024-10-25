/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/

//APPLYING MOORE'S VOTING ALGORITHM
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr=new int[]{2,2,1,1,1,2,2};
        int n=arr.length;
        int value=majorityElement(arr, n);
        System.out.println("The Majority element(>n/2) is: " + value);
    }
    
    public static int majorityElement(int[] arr, int n){
        //APPLYING MOORE'S VOTING ALGORITHM 
        int element=0;
        int cnt=0;
        for(int it: arr){
            if(cnt==0){
                element=it;
                cnt=1;
            }
            else if(it==element) cnt+=1;
            else cnt-=1;
        }
        cnt=0;
        for(int it: arr){
            if(it==element) cnt+=1;
        }
        return element=(cnt>n/2)? element:-1;
    }
}
