public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage=beverage;
    }

    public Milk(Beverage beverage,int quantity) {
        this.beverage=beverage;
        this.quantity=quantity;
    }

    public String getDescription(){
        String myDes="";
        for (int i = 0; i < quantity; i++) {
            myDes+=", milk";
        }
        return beverage.getDescription()+myDes;
    }

    public double cost() {
        return (quantity*5) + beverage.cost();
    }
}
