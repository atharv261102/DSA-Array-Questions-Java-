public class StockBuyAndSell_1 {

    public static void main(String[] args) {
        int[] arr=new int[]{7,1,5,3,6,4};
        int maxProfit=findmaxProfit(arr);
        System.out.println(maxProfit);
    }


    public static int findmaxProfit(int[] arr){
        int maxProfit=-1;
        int buyDay=arr[0];
        for(int i=1; i<arr.length; i++){
            int profit=arr[i]-buyDay;
            if(profit>maxProfit) maxProfit=profit;
            if(arr[i]<buyDay) buyDay=arr[i];
        }
        return maxProfit;
    }
}