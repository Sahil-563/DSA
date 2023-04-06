import java.util.*;
public class buy_sell_stocks {
    public static void max_profit(int prices[]){
        int buying_price=Integer.MAX_VALUE;
        int Max_profit =0;
        for(int i=0;i<prices.length;i++){
            if(buying_price<prices[i]){
                int profit =prices[i]-buying_price;
                Max_profit = Math.max(Max_profit,profit);
            }
            else{
                buying_price = prices[i];
            }
        }
        System.out.print(Max_profit);

    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        max_profit(prices);
    }
    
}
