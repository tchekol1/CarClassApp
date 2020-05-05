public class CarApp{
    public static void main(String[] args) {
        Car car= new Car("Porsche","Red",50);
        Car car1= new Car("Jetta","Blue",90);
        System.out.println(car.start());
        System.out.println(car1.start());
        System.out.println(car.accelerate());
        System.out.println(car1.accelerate());
        System.out.println(car.stop());
        System.out.println(car.stop()+ " to have its emission checked ");
        System.out.println(car1.getSpeed());


    }


}
