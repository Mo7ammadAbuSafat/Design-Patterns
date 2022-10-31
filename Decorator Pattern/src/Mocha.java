public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage=beverage;
    }

    public Mocha(Beverage beverage,int quantity) {
        this.beverage=beverage;
        this.quantity=quantity;
    }

    public String getDescription(){
        String myDes="";
        for (int i = 0; i < quantity; i++) {
            myDes+=", mocha";
        }
        return beverage.getDescription()+myDes;
    }

    public double cost() {
        return (quantity*3) + beverage.cost();
    }
}
