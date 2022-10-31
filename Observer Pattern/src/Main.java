public class Main {
    public static void main(String[] args) {
        WeatherData weather=new WeatherData();
        Observer obs = new CurrentConditionsDisplay(weather);
        Observer obs2 = new StatisticsDisplay(weather);
        weather.setMeasurements(15,20,30);
    }
}
