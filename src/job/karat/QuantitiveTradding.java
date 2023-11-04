package job.karat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
        Confidential customer material.
        -------------------------------

        A quantitative trading firm processes a list of events, each of which can be classified into one of four categories:

        1. BUY <stock> <quantity>: Signifies the purchase of <quantity> shares of stock <stock> at the market price.

        2. SELL <stock> <quantity>: Indicates the sale of <quantity> shares of stock <stock> at the market price.

        3. CHANGE <stock> <price>: Signifies a change in the market price of <stock> by <price> amount, which can be either positive or negative.

        4. QUERY: Represents a query for the gross profit/loss from the start of trading to the present.

        The trading firm makes a gross profit when the <stock> is bought at a lower cost and then the price increases. The trading firm suffers a loss when the <stock> is bought at a higher cost and the price decreases.

        Note that the stock does not need to be sold for the gross profit (or loss) to be recorded. The profit only changes when there is a change of price of a stock owned.

        Write a function that given a list of events, returns a collection of integers representing answers to each query.


        Example:

        Given the list of events:

        events_1 = [
            "BUY googl 20",
            "BUY aapl 50",
            "CHANGE googl 6",
            "QUERY",
            "SELL aapl 10",
            "CHANGE aapl -2",
            "QUERY"
        ]

        The gross profit can be tracked as follows:

        |     Events     |     Portfolio     | Gross Profit so far |
        |----------------|-------------------|---------------------|
        | BUY googl 20   | googl 20          |                   0 |
        | BUY aapl 50    | googl 20, aapl 50 |                   0 |
        | CHANGE googl 6 | googl 20, aapl 50 |                 120 |
        | QUERY          | googl 20, aapl 50 |                 120 |
        | SELL aapl 10   | googl 20, aapl 40 |                 120 |
        | CHANGE aapl -2 | googl 20, aapl 40 |                  40 |
        | QUERY          | googl 20, aapl 40 |                  40 |


        The expected result is a collection of all the query outputs: [120, 40]

        ----------

        Other test cases:

        events_2 =  ["BUY hackr 2", "QUERY"]

        In this case, the expected output is [0]. The firm purchased 2 stocks of hackr, then have a "QUERY" event. Since there is no change in stock price, there is 0 gross profit so far.

        events_3 = ["BUY stock2 2", "BUY stock1 4", "CHANGE stock2 -8", "SELL stock1 2", "BUY stock3 3", "QUERY"]

        The price of 2 shares of stock2 decreased by 8, so the expected output is [-16].


        All test cases:
        getGrossProfit(events_1) -> [120, 40]
        getGrossProfit(events_2) -> [0]
        getGrossProfit(events_3) -> [-16]
        getGrossProfit(events_4) -> [0,59296,-23980,-23980,-28780,-28780,-28780,-24126,-24126,-37939,-22188,-22188,-36894,-25824,-25824,-25824,-25824,-25824,-657052,-657052]
        getGrossProfit(events_5) -> [120, 40, 40]

        Complexity variables:
        n: the number of events
     */

public class QuantitiveTradding {


    public static List<Integer> getGrossProfit(String []events) {
        List<Integer> result = new ArrayList<>();
        List<Integer> defaultValue = Arrays.asList(0,0);
        int grossProfit = 0;
        int eventIndex = 0;
        int stockNameIndex = 1;
        int qtyPriceIndex = 2;
        int numberOfStockIndex = 0;
        int changesIndex = 1;
        Map<String, List<Integer>> eventMap = new HashMap<>();
        for (String event : events) {
            String []eventSplited = event.split(" ");
            switch(eventSplited[eventIndex].toUpperCase()) {
                case "BUY":
                    int number = eventMap.getOrDefault(eventSplited[stockNameIndex], defaultValue).get(numberOfStockIndex);
                    int change = eventMap.getOrDefault(eventSplited[stockNameIndex], defaultValue).get(changesIndex);
                    eventMap.put(eventSplited[stockNameIndex], Arrays.asList(number + Integer.valueOf(eventSplited[qtyPriceIndex]), change));
                    break;
                case "SELL":
                    number = eventMap.getOrDefault(eventSplited[stockNameIndex], defaultValue).get(numberOfStockIndex);
                    change = eventMap.getOrDefault(eventSplited[stockNameIndex], defaultValue).get(changesIndex);
                    eventMap.put(eventSplited[stockNameIndex], Arrays.asList(number - Integer.valueOf(eventSplited[qtyPriceIndex]), change));
                    break;
                case "CHANGE":
                    number = eventMap.getOrDefault(eventSplited[stockNameIndex], defaultValue).get(numberOfStockIndex);
                    change = eventMap.getOrDefault(eventSplited[stockNameIndex], defaultValue).get(changesIndex) + Integer.valueOf(eventSplited[qtyPriceIndex]);
                    eventMap.put(eventSplited[stockNameIndex], Arrays.asList(number, change ));
                    grossProfit = grossProfit + (change * number);
                    break;
                case "QUERY":
                    result.add(grossProfit);
                default:
                    System.out.println("No event found!!!");
            }
        }
        return result;
    }

//    private int calculateGrossProfit(Map<String, List<Integer>> eventMap, int change) {
//        int result = 0;
//        for (Map.Entry<String, List<Integer>> entry : eventMap.entrySet()) {
//
//        }
//        return result;
//    }

    public static void main(String arg[]) {
        String []events_1 = {
                "BUY googl 20",
                "BUY aapl 50",
                "CHANGE googl 6",
                "QUERY",
                "SELL aapl 10",
                "CHANGE aapl -2",
                "QUERY"
        };
        String []events_2 = {"BUY hackr 2", "QUERY"} ;
        String []events_3 = {"BUY stock2 2", "BUY stock1 4", "CHANGE stock2 -8", "SELL stock1 2", "BUY stock3 3", "QUERY"};
        List<Integer> result1 = getGrossProfit(events_1);
        List<Integer> result2 = getGrossProfit(events_2);
        List<Integer> result3 = getGrossProfit(events_3);
        System.out.println(result1.toString());
        System.out.println(result2.toString());
        System.out.println(result3.toString());

        int s = solution(10);
    }


    public static int solution(int number) {
        int sum = 0;
        int sumThree = 0;
        int sumFive = 0;
        while(sumThree < number) {
            sum = sum + sumThree;
            sumThree +=3;
        }
        while(sumFive < number) {
            sum = sum+sumFive;
            sumFive += 5;
        }
        return sum;
    }

}
