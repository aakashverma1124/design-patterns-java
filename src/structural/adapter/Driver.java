package structural.adapter;

public class Driver {
    public static void main(String[] args) {
        WeatherUI weatherUI = new WeatherUI();
        weatherUI.showTemperature(201016);
    }
}
