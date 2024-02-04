package 옵저버패턴;

import 옵저버패턴.observer.CurrentConditionsDisplay;
import 옵저버패턴.observer.ForecastDisplay;
import 옵저버패턴.observer.StatisticsDisplay;
import 옵저버패턴.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();


        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.4f);
        weatherData.setMeasurements(78, 90, 29.4f);
    }


}
