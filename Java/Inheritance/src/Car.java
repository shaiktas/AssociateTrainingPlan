public class Car {
    public int msrp;
    public String make;
    public String model;
    public String type;
    public float mpg;
    public int maxSpeed;

    public Car() {
        this.msrp = 30000;
        this.make = "";
        this.model = "";
        this.mpg = 0;
    }

    public Car(int msrp, String make, String model, float mileage) {
        this.msrp = msrp;
        this.make = make;
        this.model = model;
        this.mpg = mileage;
    }

    public float calculateGas(float gasLevel, float miles) {
        float gallons = miles/this.mpg;
        float remainingGas = gasLevel - gallons;

        return remainingGas;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setMpg(float mpg) {
        this.mpg = mpg;
    }

    public float getMpg() {
        return mpg;
    }

    public void setMsrp(int msrp) {
        this.msrp = msrp;
    }

    public int getMsrp() {
        return msrp;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
