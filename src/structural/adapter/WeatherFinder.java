package structural.adapter;

public class WeatherFinder implements IWeatherFinder {
    @Override
    public int find(String city) {
        return 25;
    }
}
