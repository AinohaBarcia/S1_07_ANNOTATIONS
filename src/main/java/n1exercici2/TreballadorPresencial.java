package n1exercici2;

public class TreballadorPresencial extends Treballador{
    private static int fuel;

    public TreballadorPresencial(String name, String surname, int hourPrice) {
        super(name, surname, hourPrice);

    }

    public static int getFuel() {
        return fuel;
    }

    public static void setFuel(int fuel) {
        TreballadorPresencial.fuel = fuel;
    }

    @Override
    public int calculateTotalSalary(int totalHoursMonth) {
        return super.calculateTotalSalary(totalHoursMonth) + fuel;
    }
    @Override
    @Deprecated
    public int calculateAverageHoursDay(int totalHours, int daysWeek) {
        return totalHours/daysWeek;
    }

}
