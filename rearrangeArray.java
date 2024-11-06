import java.util.List;
import java.util.ArrayList;

public class rearrangeArray {
    public static void main(String[] args) {
        int[] arr=new int[]{3,1,-2,-5,2,-4};
        int n=arr.length;
        int[] temp=new int[n];
        int pos=0;
        int neg=1;
        for(int i=0; i<n; i++){
            if(arr[i]>=0){
                temp[pos]=arr[i];
                pos+=2;
            }
            else{
                temp[neg]=arr[i];
                neg+=2;
            }
        }
        for(int i=0; i<n; i++){
            arr[i]=temp[i];
        }
        System.out.print("he array after rearrangement is: ");
        for(int it: arr) System.out.print(it + " ");
        System.out.println();
    }
}
