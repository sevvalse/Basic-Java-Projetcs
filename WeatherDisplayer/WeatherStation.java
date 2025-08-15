package WeatherDisplayer;
import java.util.ArrayList;

public class WeatherStation implements WeatherDataPublisher {
    ArrayList<DisplayUnit> displays;
    double temperature;
    double humidity;

    public WeatherStation(){
        displays = new ArrayList<>();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    @Override
    public void addDisplay(DisplayUnit display) {
        displays.add(display);
    }

    @Override
    public void removeDisplay(DisplayUnit display) {
        displays.remove(display);
    }

    @Override
    public void update(){
        for (DisplayUnit display : displays) {
            display.refresh(temperature, humidity);
        }
    }

    @Override
    public void setMeasurements(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        update();
    }

}
