package WeatherDisplayer;

public class TemperatureStatDisplay implements DisplayUnit{

    double max, min, totalTemperature, count;

    public TemperatureStatDisplay() {
        max = Double.MAX_VALUE;
        min = Double.MIN_VALUE;
        totalTemperature = 0;
        count = 0;
    }

    @Override
    public void refresh(double temperature, double humidity){
        totalTemperature += temperature;
        count ++;

        if (temperature < min){
            min = temperature;
        }
        if (temperature> max){
            max = temperature;
        }

        System.out.println("Maximum Temperature:" + max + " Minimum Temperature:" + min +
                " Average Temperature:" + totalTemperature/count);
    }
}
