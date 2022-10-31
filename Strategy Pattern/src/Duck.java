public abstract class Duck {
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public void swim(){
        System.out.println("I can swim");
    }
    abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    };

    public void setQuackBehavior(QuackBehavior newBehavior){
        quackBehavior=newBehavior;
    }

    public void setFlyBehavior(FlyBehavior newBehavior){
        flyBehavior=newBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

}
