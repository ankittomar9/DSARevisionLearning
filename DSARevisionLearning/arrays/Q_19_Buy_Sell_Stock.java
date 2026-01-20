package DSARevisionLearning.arrays;

public class Q_19_Buy_Sell_Stock {
    //Given prices array, find max profit: buy on one day, sell on later day.
        //If no profit possible → return 0.
    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        // arr[] can also be defined as price[] also arr is buying prices
        int minPrice=arr[0];
        int max_Profit=0;

        for(int i=0;i<arr.length;i++){  
            int profit_today=arr[i]-minPrice;
            max_Profit=Math.max(max_Profit, profit_today);
            minPrice=Math.min(minPrice, arr[i]);
        }


              System.out.println("min Price: "+minPrice);
            System.out.println("Maximum Profit  : "+max_Profit);

    }
    
}
