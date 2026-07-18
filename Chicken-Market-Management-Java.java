package chickenmarket;

public class ChickenMarketApp {

    public static void main(String[] args) {

        Chicken ch = new Chicken(1, 2.5);
        ch.print();

        Chicken.setDailyPrice(10);
        ch.print();

        Chicken.setNecessaryWeight(3);
        ch.print();
    }
}

class Chicken {

    private static double dailyPrice = 5;
    private static double necessaryWeight = 1.2;

    private double weight;
    private int id;

    public Chicken(int id, double weight) {
        this.weight = weight;
        this.id = id;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public static void setDailyPrice(double newDailyPrice) {
        dailyPrice = newDailyPrice;
    }

    public static void setNecessaryWeight(double newNecessaryWeight) {
        necessaryWeight = newNecessaryWeight;
    }

    public boolean canMarket() {
        return weight >= necessaryWeight;
    }

    public double price() {
        if (canMarket()) {
            return weight * dailyPrice;
        }
        return 0;
    }

    public void print() {

        System.out.println("Chicken Weight: " + weight);
        System.out.println("Chicken ID: " + id);

        if (canMarket()) {
            System.out.println("Ready for market");
            System.out.println("Price: " + price());
        } else {
            System.out.println("Does not meet the necessary weight");
        }

        System.out.println("--------------------");
    }
}