import java.util.ArrayList;

public class WeatherData implements Subject{
    float Temperature,Humidity,Pressure;
    ArrayList observers;

    public WeatherData() {
        observers= new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    };
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(float Temperature, float Humidity, float Pressure){
        for (Object obs: observers)
            ((Observer)obs).update(Temperature, Humidity, Pressure);
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.Temperature = temperature;
        this.Humidity = humidity;
        this.Pressure = pressure;
        measurementsChanged();
    }
    public void measurementsChanged(){
        notifyObservers(Temperature, Humidity, Pressure);
    }
}
