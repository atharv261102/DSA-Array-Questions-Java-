/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums. */

// import java.util.Set;
// import java.util.TreeSet;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr=new int[]{0,0,1,1,1,2,2,3,3,4};
        // int newSize=BruteForce(arr);
        int newSize=Optimal(arr);
        for(int j=0; j<newSize; j++){
            System.out.print(arr[j] + " ");
        }
    }
    
    // public static int BruteForce(int[] arr){
    //     Set<Integer> st=new TreeSet<>();
    //     for(Integer it: arr){
    //         st.add(it);
    //     }
    //     int i=0;
    //     for(Integer it: st){
    //         arr[i]=it;
    //         i+=1;
    //     }
    //     return i;
    // }
    public static int Optimal(int[] arr){
        int n=arr.length;
        int i=0;
        for(int j=0; j<n; j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i+=1;
            }
        }
        return i+1;
    }
}
