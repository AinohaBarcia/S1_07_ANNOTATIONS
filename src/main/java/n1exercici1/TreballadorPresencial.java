package n1exercici1;

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
        return (totalHoursMonth*hourPrice)+fuel;
    }
}
