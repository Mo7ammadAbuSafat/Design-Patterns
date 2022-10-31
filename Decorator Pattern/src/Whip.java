public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage=beverage;
    }

    public Whip(Beverage beverage,int quantity) {
        this.beverage=beverage;
        this.quantity=quantity;
    }

    public String getDescription(){
        String myDes="";
        for (int i = 0; i < quantity; i++) {
            myDes+=", whip";
        }
        return beverage.getDescription()+myDes;
    }

    public double cost() {
        return (quantity*10) + beverage.cost();
    }
}
