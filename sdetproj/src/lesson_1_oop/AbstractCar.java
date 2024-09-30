package lesson_1_oop;

public abstract class AbstractCar implements IMovement {
    private String engine;
    private int engine_capacity;
    private int count_wheels;
    private static int count_cars = 0;
    public AbstractCar(String engine, int engine_capacity, int count_wheels) {
        this.engine = engine;
        this.engine_capacity = engine_capacity;
        this.count_wheels = count_wheels;
        count_cars++;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public int getEngineCapacity() {
        return engine_capacity;
    }
    public void setEngineCapacity(int engine_capacity) {
        this.engine_capacity = engine_capacity;
    }
    public int getCountWheels() {
        return count_wheels;
    }
    public void setCountWheels(int count_wheels) {
        this.count_wheels = count_wheels;
    }
    public static int getCountCars() {
        return count_cars;
    }
    @Override
    public void goForward() {
        System.out.println("Прямо");
    }
    @Override
    public void goBack() {
        System.out.println("Назад");
    }
    @Override
    public void turnLeft() {
        System.out.println("Влево");
    }
    @Override
    public void turnRight() {
        System.out.println("Вправо");
    }
}
