package lesson_1_oop;

public class SportCar extends AbstractCar {
    private String sponsor = "without sponsor";
    private int idCommand = -1;

    public SportCar(String engine, int engineCapacity, int countWheels) {
        super(engine, engineCapacity, countWheels);
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getSponser() {
        return sponsor;
    }

    public void setCommand(int id) {
        this.idCommand = id;
    }

    public int getCommand() {
        return idCommand;
    }

    public String getDocument() {
        StringBuilder s = new StringBuilder("SportCar");
        if (sponsor != null) {
            s.append(getSponser());
        }
        if (idCommand != -1) {
            s.append(getCommand());
        }
        return s.toString();
    }
}
