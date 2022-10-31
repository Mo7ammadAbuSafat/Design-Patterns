public class RabberDuck extends Duck{
    public RabberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeck();
    }

    public void display(){
        System.out.println("I'm a Rabber Duck");
    }
}
