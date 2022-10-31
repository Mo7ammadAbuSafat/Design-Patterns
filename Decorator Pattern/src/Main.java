public class Main {
    public static void main(String[] args) {

        Beverage beverage=new Decaf();
        beverage =new Milk(beverage,2);
        beverage =new Whip(beverage);
        System.out.println("Description: "+beverage.getDescription());
        System.out.println("$"+beverage.cost());
        System.out.println();

        Beverage beverage2=new Decaf();
        beverage2 =new Mocha(beverage2);
        beverage2 =new Whip(beverage2,3);
        System.out.println("Description: "+beverage2.getDescription());
        System.out.println("$"+beverage2.cost());
    }
}
