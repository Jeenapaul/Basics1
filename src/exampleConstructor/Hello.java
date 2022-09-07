package exampleConstructor;

public class Hello {
    public static void main(String args[]){
    Car car = new Car(10,"closed", "Start", "seated");

//        car.setDoor("closed");
//        car.setDriver("seated");
//        car.setEngine("Start");
//        car.setSpeed(67);
        car.run();
        System.out.println(car.run());
    }
}
