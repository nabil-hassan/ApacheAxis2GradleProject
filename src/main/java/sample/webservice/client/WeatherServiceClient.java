package sample.webservice.client;

//import sample.webservice.client.GlobalWeatherStub;

import sample.webservice.client.GlobalWeatherStub;

public class WeatherServiceClient {

    public static void main(String args[]) throws Exception {
        GlobalWeatherStub stub = new GlobalWeatherStub("http://www.webservicex.com/globalweather.asmx");
        System.out.println(stub.getCitiesByCountry("Spain"));
//        System.out.println(stub.GetCitiesByCountry("Spain"));
    }

}
