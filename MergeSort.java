import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr=new int[]{6, 4, 3, 1, 2, 5};
        System.out.print("Before sort: ");
        for(int it: arr) System.out.print(it + " ");
        System.out.println();
        sortArray(arr, 0, arr.length-1);
        System.out.print("After sort: ");
        for(int it: arr) System.out.print(it + " ");
        System.out.println();
    }

    public static void sortArray(int[] arr, int s, int e){
        if(s>=e) return;
        int m=(s+(e-s)/2);
        sortArray(arr, s, m);
        sortArray(arr, m+1, e);
        mergeAll(arr, s, m, e);
    }


    public static void mergeAll(int[] arr, int s, int m, int e){
        ArrayList<Integer> list=new ArrayList<>();
        int left=s, right=m+1;
        while(left<=m && right<=e){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left+=1;
            }
            else{
                list.add(arr[right]);
                right+=1;
            }
        }
        while(left<=m){
            list.add(arr[left]);
            left+=1;
        }
        while(right<=e){
            list.add(arr[right]);
            right+=1;
        }

        for (int i = s; i <= e; i++) {
            arr[i] = list.get(i - s);
        }
    }
}
