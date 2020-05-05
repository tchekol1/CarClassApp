public class Vehicle {
    private String model;
    private String make;
    private int yearOfMake;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String model, String make, int yearOfMake) {
        this.model = model;
        this.make = make;
        this.yearOfMake = yearOfMake;
    }

    public Vehicle(String make, String color) {
        this.make = make;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }
    public String start(){
        return "starting";
    }
    public  String stop(){
        return "stopped";
    }
}
