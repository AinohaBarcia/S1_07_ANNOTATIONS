package n1exercici2;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Treballador treballador = new Treballador("Clara","Clemente",35);
        TreballadorOnline treballadorOnline = new TreballadorOnline("Pedro","Hernández",35);
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Emma","Vallés",24);

        System.out.println("La " + treballador.getName() + " fa una mitja de " + treballador.calculateAverageHoursDay(35,5)+ " hores setmana");
        System.out.println("En "+ treballadorOnline.getName() + " fa una mitja de " + treballadorOnline.calculateAverageHoursDay(45,5) +" hores setmana");
        System.out.println("L'" + treballadorPresencial.getName() + " fa una mitja de " +treballadorPresencial.calculateAverageHoursDay(46,5) + " hores setmana");

    }
}
