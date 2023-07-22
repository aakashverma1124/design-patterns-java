package structural.adapter;

public class WeatherUI {
    public void showTemperature(int zipCode) {
        WeatherAdapter weatherAdapter = new WeatherAdapter();
        System.out.println(weatherAdapter.findTemperature(zipCode));
    }
}
