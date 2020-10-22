public class SportsCar extends Car {

    SportsCar() {
        super();
        super.setType("SportsCar");
    }

    SportsCar(int msrp, String make, String model, float mileage) {
        super(msrp, make, model, mileage);
        super.setType("SportsCar");
    }

    @Override
    public float calculateGas(float gasLevel, float miles) {
        return super.calculateGas(gasLevel, miles);
    }

    @Override
    public void setMsrp(int msrp) {
        super.setMsrp(msrp);
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public void setMpg(float mpg) {
        super.setMpg(mpg);
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }
}
