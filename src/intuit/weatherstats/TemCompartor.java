package intuit.weatherstats;

import java.util.Comparator;

public class TemCompartor implements Comparator<WeatherData> {

    @Override
    public int compare(WeatherData o1, WeatherData o2) {
        if(o1.getTemp() < o2.getTemp()) {
            return 1;
        } else if(o1.getTemp() > o2.getTemp()) {
            return 1;
        }
        return 0;
    }
}
