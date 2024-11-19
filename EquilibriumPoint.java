public class EquilibriumPoint{
    public static void main(String[] args) {
        int[] arr=new int[]{1, 3, 5, 2, 2};
        int point=equilibriumPoint(arr);
        System.out.println(point);
    }
    public static int equilibriumPoint(int arr[]) {
        int n=arr.length;
        int totalSum=0;
        int tempSum=0;
        int l=0;
        for(int i=0; i<n; i++) totalSum+=arr[i];
        while(l<n){
            tempSum+=arr[l];
            if(tempSum==totalSum) return arr[l];
            totalSum-=arr[l];
            l+=1;
        }
        return -1;
    }
}