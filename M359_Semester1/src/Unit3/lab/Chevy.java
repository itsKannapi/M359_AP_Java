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
    private double taxRate = 12.2;
    private double luxuryPackIncrease;
    private double fourWDIncrease = 3500.0;
    private double sportsPackIncrease;
    private double fuelEfficiencyDeduct;

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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getLuxuryPackIncrease() {
        return luxuryPackIncrease;
    }

    public void setLuxuryPackIncrease(double luxuryPackIncrease) {
        this.luxuryPackIncrease = luxuryPackIncrease;
    }

    public double getFourWDIncrease() {
        return fourWDIncrease;
    }

    public void setFourWDIncrease(double fourWDIncrease) {
        this.fourWDIncrease = fourWDIncrease;
    }

    public double getSportsPackIncrease() {
        return sportsPackIncrease;
    }

    public void setSportsPackIncrease(double sportsPackIncrease) {
        this.sportsPackIncrease = sportsPackIncrease;
    }

    public double getFuelEfficiencyDeduct() {
        return fuelEfficiencyDeduct;
    }

    public void setFuelEfficiencyDeduct(double fuelEfficiencyDeduct) {
        this.fuelEfficiencyDeduct = fuelEfficiencyDeduct;
    }

    public String toString(){
        String str = "";
        str += "**************************************************";
        str += year + make + model + "(" + modelColor + ")";
        str += "\t BASE PRICE: \t\t\t\t " + basePrice;
        str += "\t MILES: \t\t\t\t " + mileage;
        str += "\t PACKAGES: ";

        if (luxPackStat == true){
            str += "\n - Luxury Package";
        }
        if (fourWhlDriveStat == true){
            str += "\n - 4WD Package";
        }
        if (sportsPackStat == true){
            str += "\n - Sport Package";
        }
        if (luxPackStat == false && fourWhlDriveStat == false && sportsPackStat == false){
            str += "\n - None";
        }

        str += "PRICE WITH UPGRADES: \t\t\t" + priceWithUpgrades;
        str += "FINAL PRICE WITH TAX: \t\t\t" + grandTotal;

        return str;
    }
   public double calcPrice(){
        grandTotal += basePrice;
        if (luxPackStat == true){
            grandTotal += basePrice * .20;
       }
        if (fourWhlDriveStat == true){
            grandTotal += 3500;
        }
        if (sportsPackStat == true){
            grandTotal += basePrice * .15;
            fuelEfficiency = fuelEfficiency * .80;
        }
        return grandTotal + (grandTotal * 0.122);
    }
}
