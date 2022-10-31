public class CurrentConditionsDisplay implements DisplayElement,Observer{
    float Temperature,Humidity;

    public CurrentConditionsDisplay(Subject weather) {
        weather.registerObserver(this);
    }

    public void display(){
        System.out.println("Current conditions:\n"+"Temperature is :"+Temperature+"\nHumidity is :"+Humidity+"\n");
    }

    public void update(float Temperature, float Humidity, float Pressure){
        this.Temperature=Temperature;
        this.Humidity=Humidity;
        display();
    }
}
