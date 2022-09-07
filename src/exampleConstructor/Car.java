package exampleConstructor;

public class Car {
    private int speed;
    private String door;
    private String engine;
    private String driver;

    public int getSpeed() {
        return speed;
    }

    public Car(int speed, String door, String engine, String driver) {
        this.speed = speed;
        this.door = door;
        this.engine = engine;
        this.driver = driver;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String run() {
        if (door.equals("closed") && engine.equals("Start") && driver.equals("seated") && speed > 0) {
            return "running";
        } else
            return "not running";

    }
}
