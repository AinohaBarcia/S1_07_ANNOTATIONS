package n1exercici1;

public class TreballadorOnline extends Treballador{

    private final int WIFIPRICE;

    public TreballadorOnline(String name, String surname, int hourPrice, int WIFIPRICE) {
        super(name, surname, hourPrice);
        this.WIFIPRICE = WIFIPRICE;
    }

    public int getWIFIPRICE() {
        return WIFIPRICE;
    }

    @Override
    public int calculateTotalSalary(int totalHoursMonth) {
        return (totalHoursMonth*hourPrice)+WIFIPRICE;
    }
}
