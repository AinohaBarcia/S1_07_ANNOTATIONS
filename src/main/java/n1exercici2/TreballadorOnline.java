package n1exercici2;

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
        return super.calculateTotalSalary(totalHoursMonth)+WIFIPRICE;
    }

    @SuppressWarnings("DeprecatedIsStillUsed")
    @Override
    @Deprecated
    public int calculateAverageHoursDay(int totalHours, int daysWeek) {
        int average = totalHours / daysWeek;
        return average;
    }
}
