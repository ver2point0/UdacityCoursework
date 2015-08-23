package lesson1introduction;

public class Algorithms {
    private static String carOne = "Truck";
    private static String carTwo = "Sedan";
    private static int carOnePrice = 15000;
    private static int carTwoPrice = 30000;
    private static int carOneMpg = 10;
    private static int carTwoMpg = 50;
    private static int pricePerGal = 4;
    private static int milesDriven = 50000;
    private static int carOneGasCost = (milesDriven / carOneMpg) * pricePerGal;
    private static int carOneTotalCost = carOnePrice + carOneGasCost;
    private static int carTwoGasCost = (milesDriven / carTwoMpg) * pricePerGal;
    private static int carTwoTotalCost = carTwoPrice + carTwoGasCost;

    public static void main(String[] args) {
        // program to compute which car is better to buy
        // based on miles driven, gas mileage, and price per gallon
        System.out.println("Car one: " + carOne
            + "\nMiles Driven: " + milesDriven
            + "\nMPG: " + carOneMpg
            + "\nPrice/gal: $" + pricePerGal
            + "\nGas cost: $" + carOneGasCost
            + "\nTotal cost: $" + carOneTotalCost);

        System.out.println("\nCar two: " + carTwo
                + "\nMiles Driven: " + milesDriven
                + "\nMPG: " + carTwoMpg
                + "\nPrice/gal: $" + pricePerGal
                + "\nGas cost: $" + carTwoGasCost
                + "\nTotal cost: $" + carTwoTotalCost);

        if (carOneTotalCost < carTwoTotalCost) {
            System.out.println("Buy the Truck!");
        } else  {
            System.out.println("Buy the Sedan!");
        }

    }
}
