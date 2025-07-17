//Stock buy and sell
//Time Complexity:O(n)
//Space Complexity:O(1)

public class Main{
  public static int maxProfit(int[] arr) {
    int minPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int price:arr){
      if(price<minPrice){
        minPrice=price;
      }else {
        int profit=price-minPrice;
        if(profit>maxProfit){
          maxProfit=profit;
        }
      }
    }
    return maxProfit;
  }
}
