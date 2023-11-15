package n1exercici1;

public class TreballadorOnline extends Treballador{

    private final int WIFIPRICE=50;

    public TreballadorOnline(String name, String surname, int hourPrice) {
        super(name, surname, hourPrice);
    }

    public int getWIFIPRICE() {
        return WIFIPRICE;
    }

    @Override
    public int calculateTotalSalary(int totalHoursMonth) {
        return super.calculateTotalSalary(totalHoursMonth)+WIFIPRICE;
    }
}
