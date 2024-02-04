package 옵저버패턴;

public class StatisticsDisplay implements Observer, DisplayElement{

    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("평균/최고/최저 = %.1f/%.1f/%.1f \n", temperature, temperature, temperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
