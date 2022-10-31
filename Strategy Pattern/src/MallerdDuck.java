public class MallerdDuck extends Duck{
    public MallerdDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a Mallerd Duck");
    }
}
