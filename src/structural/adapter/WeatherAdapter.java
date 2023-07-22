package structural.adapter;

public class WeatherAdapter {
    public int findTemperature(int zipCode) {
        String city = null;

        // Some database call will happen here. As of now we are simply assuming one city.
        if(zipCode == 201016) {
            city = "Ghaziabad";
        }
        WeatherFinder weatherFinder = new WeatherFinder();
        return weatherFinder.find(city);
    }
}
