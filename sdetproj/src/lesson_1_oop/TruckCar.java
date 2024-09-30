package lesson_1_oop;

public class TruckCar extends AbstractCar implements ICargoOperations{
    private String company;
    private String driver;
    private String cargo;
    public TruckCar(String engine, int engine_capacity, int count_wheels) {
        super(engine, engine_capacity, count_wheels);
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
        if (checkCargo())
            System.out.println("Груз загружен. Вы не можете загрузить еще один груз");
        else
            System.out.println("Вы можете загрузить груз");
    }
    @Override
    public void unloadCargo() {
        if (checkCargo())
            System.out.println("Вы можете разгурзить груз");
        else
            System.out.println("Груза нет. Вы не можете разгрузить груз");
    }
    @Override
    public boolean checkCargo() {
        if (cargo != null) {
            System.out.println("Груз загружен");
            return true;
        }
        return false;
    }
    public String TruckDocument() {
        String s = "Truck Document ";
        if (cargo != null)
            s += getCargo();
        if (driver != null)
            s += getDriver();
        if (company != null)
            s += getCompany();
        return s;
    }
}
