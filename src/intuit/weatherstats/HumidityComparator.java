package intuit.weatherstats;

import java.util.Comparator;

public class HumidityComparator implements Comparator<WeatherData> {
    @Override
    public int compare(WeatherData o1, WeatherData o2) {
        if (o1.getHumidity() > o2.getHumidity()) {
            return -1;
        } else if (o1.getHumidity() < o2.getHumidity()) {
            return 1;
        }
        return 0;
    }
}
