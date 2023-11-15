package n1exercici1;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreballadorOnline treballadorOnline = new TreballadorOnline("Emma","Vallés",28);
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Clara","Palacios",25);
        Treballador treballador = new Treballador("Clara","Clemente",25);

        System.out.println( "El sueldo de " + treballadorOnline.getName()+ " " + treballadorOnline.getSurname()+
                " es de " + treballadorOnline.calculateTotalSalary(160)+" euros");
        System.out.println("El sueldo de " + treballadorPresencial.getName()+ " "+treballadorPresencial.getSurname()+
                " es de " + treballadorPresencial.calculateTotalSalary(160) +" euros");
        System.out.println("El sueldo de " + treballador.getName()+ " " + treballador.getSurname() +" " +
                " es de " + treballador.calculateTotalSalary(160)+ " euros");
    }
}
