package intuit.weatherstats;

import java.util.Comparator;

public class TempCompartor implements Comparator<WeatherData> {

    @Override
    public int compare(WeatherData o1, WeatherData o2) {
        return Integer.compare(o1.getTemp(), o2.getTemp());
    }
}
