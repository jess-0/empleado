import java.util.Scanner;

import com.itextpdf.text.Document;


public class Sistema{
public static void main(String[] args) {
    try (Scanner lector = new Scanner (System.in)) {
        int opc;
        float sueldo;
        int yearServicio;
        String nombre;
        Empleado empleado0=null;
 

        System.out.println("Bienvenido al registro de empleados");
        do { 
            System.out.println("Seleccione la operación que desea realizar, solo números del 0 al 4");
            System.out.println("0- Salir");
            System.out.println("1- Guardar los datos de un empleado");
            System.out.println("2- Modificar datos del empleado");
            System.out.println("3- Ver los datos ingresados");
            System.out.println("4-Generar un archivo PDF");      
            opc=lector.nextInt();
  
               switch (opc) {
                    case 1 -> {
                        System.out.println("Ingrese el nombre del empleado");
                        lector.nextLine();//para limpiar y que no se mezclen los datos
                        //Debe de ir antes de asignarle un valor a nombre ya que de lo contrario no se guardará correctamemte
                        nombre=lector.nextLine();
                        System.out.println("Ingrese cuanto es el sueldo del empleado");
                        sueldo=lector.nextFloat();
                        System.out.println("Ingrese los años de servicio que lleva el empleado");
                        yearServicio=lector.nextInt();

                        empleado0=new Empleado(nombre, sueldo, yearServicio);
                }
                        
                    case 2 -> {
                        System.out.println("Ingrese nuevamente el nombre");
                        lector.nextLine();
                        String otroNombre=lector.nextLine();
                        empleado0.setNombre(otroNombre);
                        System.out.println("Ingrese nuevamente el sueldo que recibe el empleado");
                        float newSueldo=lector.nextFloat();
                        empleado0.setSueldo(newSueldo);
                        System.out.println("Ingrese nuevamente los años de servicio del empleado");
                        int newYear=lector.nextInt();
                        empleado0.setYearServicio(newYear);
                }
                    case 3 -> {
                        System.out.println("Nombre del empleado "+empleado0.getNombre());// mandando a llamar al objeto y a su comportamiento
                        System.out.println("Sueldo que recibe "+empleado0.getSueldo());
                        System.out.println("Años de servicio "+ empleado0.getYearServicio());
                }
                    case 4 -> {
                        System.out.println("Generando archivo PDF...");
                            
                        Document document =new document();

                }

            }
}while (opc!= 0);
    }
}
}

// += es concatenar cuando se suman valores de tipo string

