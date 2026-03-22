package dsa_jan_revision.arrayBasics;

public class Q_19_Best_time_to_buy_sell_stocks {
    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        // Goal is to make maximum profit ; Profit= SellingPrice-CostPrice
        //Prices are in array  
        stockHelper(arr);
    }
    public static void stockHelper(int arr[]){
         if (arr==null || arr.length<2) {
            System.out.println("Not enough data to trade.");
            return;
        }
    int minPriceSoFar=arr[0];
    int maxProfit=0;

    for(int i=0;i<arr.length;i++){
        int currentPrice=arr[i];

        if(currentPrice<minPriceSoFar){
            minPriceSoFar=currentPrice;
        }else{
            int ProfitSoldToday=currentPrice-minPriceSoFar;

            if(ProfitSoldToday>maxProfit){
                maxProfit=ProfitSoldToday;
            }
        }
    }
    System.out.println("maximum Profit So Far : \n"+maxProfit);
    }
}
