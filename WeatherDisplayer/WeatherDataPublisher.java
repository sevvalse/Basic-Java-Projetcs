package WeatherDisplayer;

public interface WeatherDataPublisher {
    public void addDisplay(DisplayUnit du);
    public void removeDisplay(DisplayUnit du);
    public void update();
    public void setMeasurements(double temperature, double humidity);
}
