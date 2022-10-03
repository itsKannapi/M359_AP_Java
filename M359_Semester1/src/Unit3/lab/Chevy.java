package Unit3.lab;

public class Chevy {
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private int basePrice;
    private String model;
    private String modelColor;
    private double priceWithUpgrades;
    private double grandTotal;
    private boolean luxPackStat; // luxury package status
    private boolean fourWhlDriveStat; // 4WD package status
    private boolean sportsPackStat; // sports package status
    //Constants
    private String make = "Chevrolet";
    private double taxRate = .122;
    private double luxuryPackIncrease = getBasePrice() * .20;;
    private double fourWDIncrease = 3500;
    private double sportsPackIncrease = getBasePrice() * .15;
    private double fuelEfficiencyDeduct = fuelEfficiency * .80;

    // Full Constructor

    public Chevy(int year, int mileage, double fuelEfficiency, int basePrice, String model,
                 String modelColor, boolean luxPackStat, boolean fourWhlDriveStat,
                 boolean sportsPackStat) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.basePrice = basePrice;
        this.model = model;
        this.modelColor = modelColor;
        this.luxPackStat = luxPackStat;
        this.fourWhlDriveStat = fourWhlDriveStat;
        this.sportsPackStat = sportsPackStat;
    }


    // Default Constructor


    public Chevy() {
        this.year = 2021;
        this.mileage = 0;
        this.fuelEfficiency = 35;
        this.basePrice = 16000;
        this.model = "Trax";
        this.modelColor = "White";
    }

    //compares the mileage in between cars
    public int compareTo(Chevy other){
        return this.mileage - other.mileage;
    }

    public boolean equals(Chevy other) {
        if (this.modelColor.equals(other.modelColor) && this.model.equals(model)){
            if (this.mileage >= 200 && other.mileage >= 200){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }
    public boolean getSportsPackStat(){
        return sportsPackStat;
    }
    public boolean getFourWhlDriveStat(){
        return fourWhlDriveStat;
    }
    public boolean getLuxPackStat(){
        return luxPackStat;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelColor() {
        return modelColor;
    }

    public void setModelColor(String modelColor) {
        this.modelColor = modelColor;
    }

    public double getPriceWithUpgrades() {
        return priceWithUpgrades;
    }

    public void setPriceWithUpgrades(double priceWithUpgrades) {
        this.priceWithUpgrades = priceWithUpgrades;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public boolean isLuxPackStat() {
        return luxPackStat;
    }

    public void setLuxPackStat(boolean luxPackStat) {
        this.luxPackStat = luxPackStat;
    }

    public boolean isFourWhlDriveStat() {
        return fourWhlDriveStat;
    }

    public void setFourWhlDriveStat(boolean fourWhlDriveStat) {
        this.fourWhlDriveStat = fourWhlDriveStat;
    }

    public boolean isSportsPackStat() {
        return sportsPackStat;
    }

    public void setSportsPackStat(boolean sportsPackStat) {
        this.sportsPackStat = sportsPackStat;
    }

    public String toString(){
        String str = "";
        str += "**************************************************";
        str += "\n " + " " + year + " " + make + " " + model + " (" + modelColor + ")";
        str += "\n\t BASE PRICE: \t\t " + basePrice;
        str += "\n\t MILES: \t\t\t " + mileage;
        str += "\n\t FUEL EFFICIENCY: \t " + fuelEfficiency + " mpg";
        str += "\n\t PACKAGES: ";

        if (isLuxPackStat() == true){
            str += "\n\t\t - Luxury Package";
            setLuxPackStat(true);
        }
        if (isFourWhlDriveStat() == true){
            str += "\n\t\t - 4WD Package";
            setFourWhlDriveStat(true);
        }
        if (isSportsPackStat() == true){
            str += "\n\t\t - Sport Package";
            setSportsPackStat(true);
        }
        if (luxPackStat == false && fourWhlDriveStat == false && sportsPackStat == false){
            str += "\n\t\t - None";
        }

        grandTotal = calcPrice() + (calcPrice() * taxRate);
        setGrandTotal(grandTotal);
        setPriceWithUpgrades(priceWithUpgrades);

        str += "\n\n\t PRICE WITH UPGRADES: \t\t\t" + priceWithUpgrades;
        str += "\n\t FINAL PRICE WITH TAX: \t\t\t" + grandTotal;
        str += "\n**************************************************";

        return str;
    }
   public double calcPrice(){
        priceWithUpgrades = getBasePrice();

        if (luxPackStat) {
            priceWithUpgrades += getBasePrice() * .20;
        }
        if (fourWhlDriveStat) {
            priceWithUpgrades += 3500;
        }
        if (sportsPackStat) {
            priceWithUpgrades += getBasePrice() * .15;
            fuelEfficiency = fuelEfficiencyDeduct;
        }
        return priceWithUpgrades;
    }
}
