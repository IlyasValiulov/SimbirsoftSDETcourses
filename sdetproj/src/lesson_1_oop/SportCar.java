package lesson_1_oop;

public class SportCar extends AbstractCar {
    private String sponsor = "without sponsor";
    private int id_command = -1;
    public SportCar(String engine, int engine_capacity, int count_wheels) {
        super(engine, engine_capacity, count_wheels);
    }
    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
    public String getSponser() {
        return sponsor;
    }
    public void setCommand(int id) {
        this.id_command = id;
    }
    public int getCommand() {
        return id_command;
    }
    public String NameSportCar() {
        String s = "Sport Car";
        if (sponsor != null)
            s += getSponser();
        if (id_command != -1)
            s += getCommand();
        return s;
    }
}
