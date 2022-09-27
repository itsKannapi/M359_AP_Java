package Unit3.lab;

public class Chevy {
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private double basePrice;
    private double priceWithUpgrades;
    private double grandTotal;
    private String modelColor;
    private boolean luxPackStat; // luxury package status
    private boolean fourWhlDriveStat; // 4WD package status
    private boolean sportsPackStat; // sports package status
    //Constants
    private String make = "Chevrolet";
    private double taxRate = 12.2;
    private double luxuryPackIncrease;
    private double fourWDIncrease;
    private double sportsPackIncrease;
    private double fuelEfficiencyDeduct;

    // Full Constructor
    public Chevy(int year, int mileage, double fuelEfficiency, double basePrice, double priceWithUpgrades,
                 double grandTotal, String modelColor, boolean luxPackStat, boolean fourWhlDriveStat,
                 boolean sportsPackStat) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.basePrice = basePrice;
        this.priceWithUpgrades = priceWithUpgrades;
        this.grandTotal = grandTotal;
        this.modelColor = modelColor;
        this.luxPackStat = luxPackStat;
        this.fourWhlDriveStat = fourWhlDriveStat;
        this.sportsPackStat = sportsPackStat;
    }

    // Default Constructor
    public Chevy(int year, int mileage, double fuelEfficiency, double basePrice, double priceWithUpgrades, double grandTotal, String modelColor) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.basePrice = basePrice;
        this.priceWithUpgrades = priceWithUpgrades;
        this.grandTotal = grandTotal;
        this.modelColor = modelColor;
    }
}
