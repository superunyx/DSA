import java.util.*;

public class StockbuyandSell{
    public static int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int cost=0;
        int min=prices[0];
        for (int i=0;i<n;i++){
            cost=prices[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int profit = maxProfit(arr);
        System.out.println("Max profit you can make is: "+profit); 
    }
}
