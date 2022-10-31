public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(float Temperature, float Humidity, float Pressure);
}
