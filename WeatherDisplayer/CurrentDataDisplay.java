package WeatherDisplayer;

public class CurrentDataDisplay implements DisplayUnit {
    @Override
    public void refresh(double temperature, double humidity) {
        System.out.println("Current Data Display");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
    }
}
