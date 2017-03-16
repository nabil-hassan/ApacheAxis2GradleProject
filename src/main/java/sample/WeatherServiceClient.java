package sample;

import sample.client.GlobalWeatherStub;

public class WeatherServiceClient {

    public static void main(String args[]) throws Exception {
        GlobalWeatherStub stub = new GlobalWeatherStub("http://localhost:8080/axis2/services/GlobalWeather");
        System.out.println(stub.getCitiesByCountry("Spain"));
    }

}
