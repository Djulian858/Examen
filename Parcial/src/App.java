import javax.print.Doc;
import java.util.*;;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
       //Creamos libro 1

       Libro libro1 = new Libro();

       //Creamos el libro 2

       Libro libro2 = new Libro("Escalofrios","Robert .L",15,7);
    
       // datos para libro2

       System.out.print("Introduce el título del libro : ");
       libro2.setTitulo(scanner.nextLine());
       System.out.print("Introduce el autor del libro : ");
       libro2.setAutor(scanner.nextLine());
       System.out.print("Introduce el número de ejemplares del libro : ");
       libro2.setNumeroEjemplares(scanner.nextInt());
       System.out.print("Introduce el número de ejemplares prestados del libro : ");
       libro2.setNumeroEjemplaresPrestados(scanner.nextInt());
       System.out.println("--------------------------------");

       System.out.println("\nDatos del Libro :");
       System.out.println(libro2.toString());

       System.out.println("---------------------------------");

       // Probar los métodos de prestamo y devolucion
       System.out.println("Probando métodos de préstamo y devolución");

       // Prueba con objeto libro1
       System.out.println("Pruebas con Libro 1:");
       System.out.println("Intentando prestar un ejemplar de Libro 1...");
       if (libro1.prestamo()) {
           System.out.println("Préstamo exitoso... \n Estado actual: " + libro1.toString());
       } else {
           System.out.println("Préstamo fallido. No hay ejemplares disponibles.");
       }

       System.out.println("Intentando devolver un ejemplar de Libro 1...");
       if (libro1.devolucion()) {
           System.out.println("Devolución exitosa... Estado actual: " + libro1.toString());
       } else {
           System.out.println("Devolución fallida!!! \n No hay ejemplares prestados.");
       }

       System.out.println("---");

       // Prueba con objeto libro2
       System.out.println("Pruebas con Libro 2:");
       System.out.println("Intentando prestar un ejemplar de Libro 2...");
       if (libro2.prestamo()) {
           System.out.println("Préstamo exitoso. Estado actual: " + libro2.toString());
       } else {
           System.out.println("Préstamo fallido. No hay ejemplares disponibles.");
       }

       System.out.println("Intentando devolver un ejemplar de Libro 2...");
       if (libro2.devolucion()) {
           System.out.println("Devolución exitosa. Estado actual: " + libro2.toString());
       } else {
           System.out.println("Devolución fallida. No hay ejemplares prestados.");
       }

       scanner.close();
   }

}

