package n1exercici1;

public abstract class Treballador {

    protected String name;
    protected String surname;
    protected int hourPrice;


    public Treballador(String name, String surname, int hourPrice) {
        this.name = name;
        this.surname = surname;
        this.hourPrice = hourPrice;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHourPrice() {
        return hourPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setHourPrice(int hourPrice) {
        this.hourPrice = hourPrice;
    }

    public abstract int calculateTotalSalary(int totalHours) ;


}
