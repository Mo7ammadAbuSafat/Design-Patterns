public class Main {
    public static void main(String[] args) {
        Duck mallerd = new MallerdDuck();
        mallerd.performFly();
        mallerd.performQuack();
        mallerd.setQuackBehavior(new MuteQuack());
        mallerd.performQuack();
        System.out.println("___________________________________");
        Duck rabber = new RabberDuck();
        rabber.performFly();
        rabber.performQuack();
        rabber.setFlyBehavior(new FlyWithWings());
        rabber.performFly();
    }
}
