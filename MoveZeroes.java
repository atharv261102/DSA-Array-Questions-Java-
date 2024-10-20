public class MoveZeroes{
    public static void main(String[] args) {
        int [] arr=new int[]{0, 1, 0, 3, 12};
        int n=arr.length;
        moveZeroes(arr, n);
        for(int it: arr) System.out.print(it + " ");
    }

    public static void moveZeroes(int[] arr, int n){
        int i=0; 
        for(int j=0; j<n; j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i+=1;
            }
        }
    }
}