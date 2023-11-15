package n1exercici2;

public class TreballadorOnline extends Treballador{
    private final int WIFIPRICE= 50;

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


    @Override
    @Deprecated
    public int calculateAverageHoursDay(int totalHours, int daysWeek) {
        int average = totalHours / daysWeek;
        return average;
    }
}
