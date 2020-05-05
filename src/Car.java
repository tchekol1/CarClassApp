public class Car extends Vehicle {
    //private member variables
    //a default constructor
    //an overloaded constructor
    //methods which return a string indicating each task the car is performing.
    private double speed;

    public Car() {
        super();

    }

    public Car(String model, String make, int yearOfMake, double speed) {
        super(model, make, yearOfMake);
        this.speed = speed;
    }
    public Car(String model, String make, double speed) {
        super(model, make);
        this.speed = speed;
    }



    public String getSpeed() {
        return "The "+getColor()+" "+getMake()+" is going "+speed+" mph";
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public String accelerate(){
        return "The " +getColor()+" "+ getMake()+ " is accelerating ";
    }
    public String start(){
        return "The "+getColor()+" "+getMake()+" is "+super.start();
    }
    public String stop(){
        return "The "+getColor()+" "+getMake()+" is "+super.stop();
    }
}
