package inheritance;

public class Driver extends Person
{
    private boolean hasLicense;

    public Driver(String name, int age, String gender, boolean hasLicense)
    {
        super(name, age, gender);
        this.hasLicense = hasLicense;
    }

    public boolean isHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }

    public void display()
    {
        super.display();
        System.out.println(this.getName() + " is a driver");
    }

    public boolean validateDriver()
    {
        return this.getAge() >= 18 && this.hasLicense;
    }
}
