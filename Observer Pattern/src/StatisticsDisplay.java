public class StatisticsDisplay implements DisplayElement,Observer{
    float Temperature,Humidity, Pressure;

    public StatisticsDisplay(Subject weather) {
        weather.registerObserver(this);
    }

    public void display(){
        System.out.println("Avg temperature:\n"+((Temperature+Humidity+Pressure)/3)+"\n");
    }

    public void update(float Temperature, float Humidity, float Pressure){
        this.Temperature=Temperature;
        this.Humidity=Humidity;
        this.Pressure=Pressure;
        display();
    }
}

