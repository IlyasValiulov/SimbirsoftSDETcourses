package lesson_3_generics.generics;

public class TruckCar<T> extends AbstractCar<T> implements CargoOperations {
    private String company;
    private String driver;
    private String cargo;

    public TruckCar(T engine, int engineCapacity, int countWheels) {
        super(engine, engineCapacity, countWheels);
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDriver() {
        return driver;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public void loadCargo() {
        if (checkCargo()) {
            System.out.println("Груз загружен. Вы не можете загрузить еще один груз");
            return;
        }
        System.out.println("Вы можете загрузить груз");
    }

    @Override
    public void unloadCargo() {
        if (checkCargo()) {
            System.out.println("Вы можете разгурзить груз");
            return;
        }
        System.out.println("Груза нет. Вы не можете разгрузить груз");
    }

    @Override
    public boolean checkCargo() {
        if (cargo == null) {
            return false;
        }
        System.out.println("Груз загружен");
        return true;
    }

    public String getDocument() {
        StringBuilder s = new StringBuilder("TruckDocument");
        if (cargo != null) {
            s.append(getCargo());
        }
        if (driver != null) {
            s.append(getDriver());
        }
        if (company != null) {
            s.append(getCompany());
        }
        return s.toString();
    }
}
