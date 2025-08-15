package WeatherDisplayer;

public class Main {
    public static void main(String[] args) {
        WeatherDataPublisher weatherStation = new WeatherStation();
        DisplayUnit currentDataDisplay = new CurrentDataDisplay();
        DisplayUnit temperatureStatDisplay = new TemperatureStatDisplay();

        weatherStation.addDisplay(currentDataDisplay);
        weatherStation.addDisplay(temperatureStatDisplay);

        weatherStation.setMeasurements(30.5,50);

        weatherStation.setMeasurements(28,60);

        weatherStation.setMeasurements(36,40);
    }
}
