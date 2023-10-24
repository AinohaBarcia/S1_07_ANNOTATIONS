package n1exercici2;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        TreballadorOnline treballadorOnline = new TreballadorOnline("Pedro","Hernández",35,50);

        System.out.println(treballadorOnline.calculateAverageHoursDay(45,5));

    }
}
