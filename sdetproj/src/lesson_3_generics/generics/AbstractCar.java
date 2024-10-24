package lesson_3_generics.generics;

public abstract class AbstractCar<T> implements Movement, CarParts<T> {
    private T engine;
    private int engineCapacity;
    private int countWheels;
    private static int countCars = 0;

    protected AbstractCar(T engine, int engineCapacity, int countWheels) {
        this.engine = engine;
        this.engineCapacity = engineCapacity;
        this.countWheels = countWheels;
        countCars++;
    }

    public T getEngine() {
        return engine;
    }

    public void setEngine(T engine) {
        this.engine = engine;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public static int getCountCars() {
        return countCars;
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
