package intuit.weatherstats;

import java.util.ArrayList;
import java.util.List;

public class WeatherStats {
    public TopK getTopKByStats(int k, String stats, List<WeatherData> weatherDatas) {
        switch (stats) {
            case "temp":
                //Collections.sort(weatherDatas, new TemCompartor());
                weatherDatas.sort(new TempCompartor());
            case "humidity":
                //Collections.sort(weatherDatas, new HumidityComparator());
                weatherDatas.sort(new HumidityComparator());
        }
        List<WeatherData> result = new ArrayList<>();
        for (int i=0; i<k; i++) {
            result.add(weatherDatas.get(i));
        }
        return new TopK(k, stats, result);
    }
}
