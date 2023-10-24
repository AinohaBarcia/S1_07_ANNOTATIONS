package n1exercici1;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreballadorOnline treballadorOnline = new TreballadorOnline("Emma","Vallés",28,45);
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Clara","Palacios",25);

        System.out.println( "El sueldo de " + treballadorOnline.getName()+ " " + treballadorOnline.getSurname()+
                " es de " + treballadorOnline.calculateTotalSalary(40)+" euros");
        System.out.println("El sueldo de " + treballadorPresencial.getName()+ " "+treballadorPresencial.getSurname()+
                " es de " + treballadorPresencial.calculateTotalSalary(35) +" euros");
    }
}
