package intuit.weatherstats;

import java.util.Comparator;

public class HumidityComparator implements Comparator<WeatherData> {
    @Override
    public int compare(WeatherData o1, WeatherData o2) {
       return Integer.compare(o1.getHumidity(), o2.getHumidity());
    }
}
