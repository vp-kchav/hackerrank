package intuit.ratelimiting;

public class Tuple {
    long scaleTimePeriod;
    int numberOfRequest;

    public Tuple(long scaleTimePeriod, int numberOfRequest) {
        this.scaleTimePeriod = scaleTimePeriod;
        this.numberOfRequest = numberOfRequest;
    }

    public Tuple(long scaleTimePeriod) {
        this.scaleTimePeriod = scaleTimePeriod;
        this.numberOfRequest = 1;
    }

    public void setScaleTimePeriod(long currentTimePeriod) {
        this.scaleTimePeriod = currentTimePeriod;
    }

    public void setNumberOfRequest(int numberOfRequest) {
        this.numberOfRequest = numberOfRequest;
    }

    public long getScaleTimePeriod() {
        return scaleTimePeriod;
    }

    public int getNumberOfRequest() {
        return numberOfRequest;
    }
}
