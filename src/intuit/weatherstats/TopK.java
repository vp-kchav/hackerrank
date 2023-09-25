package intuit.weatherstats;

import java.util.List;

public class TopK {
    private int k;
    private String stat;
    private List<WeatherData> dataList;

    public TopK(int k, String stat, List<WeatherData> dataList) {
        this.k = k;
        this.stat = stat;
        this.dataList = dataList;
    }

    public List<WeatherData> getDataList() {
        return this.dataList;
    }
}
