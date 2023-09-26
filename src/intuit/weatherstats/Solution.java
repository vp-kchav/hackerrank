package intuit.weatherstats;

import java.util.ArrayList;
import java.util.List;

//Level Options: `swe2`, `sse`, `staff`
public class Solution {
    public static void main(String[] args) {

        List<WeatherData> inputList = new ArrayList<>();

        /* Data setup */
        WeatherData mumbai = new WeatherData(1, "mumbai", 28, 14, 85);
        inputList.add(mumbai);
        WeatherData tokyo = new WeatherData(2, "tokyo", 26, 11, 12);
        inputList.add(tokyo);
        WeatherData seoul = new WeatherData(3, "seoul", 24, 12, 50);
        inputList.add(seoul);
        WeatherData seattle = new WeatherData(4, "seattle", 14, 8, 20);
        inputList.add(seattle);
        WeatherData chicago = new WeatherData(5, "chicago", 2, 14, 21);
        inputList.add(chicago);
        WeatherData paris = new WeatherData(6, "paris", 18, 15, 34);
        inputList.add(paris);
        WeatherData london = new WeatherData(7, "london", 19, 14, 51);
        inputList.add(london);
        WeatherData rome = new WeatherData(8, "rome", 25, 18, 60);
        inputList.add(rome);
        WeatherData auckland = new WeatherData(7, "auckland", 7, 10, 15);
        inputList.add(auckland);
        WeatherData moscow = new WeatherData(8, "moscow", -1, 12, 5);
        inputList.add(moscow);


        WeatherStats ws = new WeatherStats();

        try {

            TopK tempTopk = ws.getTopKByStats(5, "temp", inputList);
            TopK humidityTopK = ws.getTopKByStats(5, "humidity", inputList);

            System.out.println(" ********* TEMP ********** ");
            for(WeatherData city : tempTopk.getDataList()) {
                System.out.println(city.toString());
            }

            System.out.println(" ********* HUMIDITY ********** ");
            for(WeatherData city : humidityTopK.getDataList()) {
                System.out.println(city.toString());
            }

            // TopK exceptionTest = ws.getTopKDataByStat(50, "humidity", inputList);  //  Expected exception: "Invalid k value"

        } catch(Exception e) {
            System.out.println("Exception caught: " + e.toString());
        }

    }
}
