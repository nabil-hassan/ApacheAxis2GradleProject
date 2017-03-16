package net.weather.webservice;

/**
 * This class contains business logic for the two methods supported by the Global weather web service.
 * It is copied into the AAR file created by the corresponding Gradle build goal and can be changed as necessary.
 */
public class GlobalWeatherSkeleton implements GlobalWeatherSkeletonInterface {

    @Override
    public String getCitiesByCountry(String countryName) {
        return "You called getCitiesByCountry";
    }

    @Override
    public String getWeather(String cityName, String countryName0) {
        return "You called getWeather";
    }
}
