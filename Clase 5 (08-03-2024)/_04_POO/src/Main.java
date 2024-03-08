import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        /*Ejericio #1*/

        //crear una instancia o objeto de una clase
        Libro objLibro = new Libro("100 años de soledad","Gabriel Garcia Marquez","01-05-1967",false);

       //forma de ingresar a un atributo de una clase desde otra
        System.out.println(objLibro.getTitulo());
        objLibro.setTitulo("El rastro de tu sangre en la nieve");
        System.out.println(objLibro.toString());

        /*Ejercicio #2*/
        Empleado objEmpleado = new Empleado();
        int id=0;
        System.out.println("Ingrese el nombre del empleado: ");
        objEmpleado.setNombre(objScanner.nextLine());
        System.out.println("Ingrese el salario base del empleado: ");
        objEmpleado.setSalario(objScanner.nextDouble());
        System.out.println("Ingrese el cargo del empleado: ");
        objEmpleado.setCargo(objScanner.next());
        System.out.println("Ingrese el porcentaje de aumento (0-100):");
        objEmpleado.setAumento(objScanner.nextInt());
        objEmpleado.setId(id);
        id++;
        System.out.println("El nuevo salario de "+objEmpleado.getNombre()+" es de: "+objEmpleado.getSalario());
    }
}