import javax.print.Doc;
import java.util.*;;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
       //Creamos libro 1

       Libro libro1 = new Libro("Caleñisimo","Luis Fernando",
       15,7,"Entretenimiento","Sl 123");

       //Creamos el libro 2

       Libro libro2 = new Libro();
    
       // datos para libro2

       System.out.print("Introduce el título del libro : ");
       libro2.setTitulo(scanner.nextLine());
       System.out.print("Introduce el autor del libro : ");
       libro2.setAutor(scanner.nextLine());
       System.out.print("Introduce el número de ejemplares del libro : ");
       libro2.setNumeroEjemplares(scanner.nextInt());
       System.out.print("Introduce el número de ejemplares prestados del libro : ");
       libro2.setNumeroEjemplaresPrestados(scanner.nextInt());
       System.out.println("\n--------------------------------\n");

       System.out.println("\nDatos del Libro : \n");
       System.out.println(libro2.toString());

       System.out.println("---------------------------------");

       // Probar los métodos de prestamo y devolucion
       System.out.println("\nProbando métodos de préstamo y devolución\n");

       // Prueba con objeto libro1
       System.out.println("Pruebas con Libro 1: \n");
       System.out.println("Intentando prestar un ejemplar de Libro 1...");
       if (libro1.prestamo()) {
           System.out.println("\nPréstamo exitoso...\n");
           System.out.println("\nEstado actual: " + libro1.toString());
       } else {
           System.out.println("\nPréstamo fallido... No hay ejemplares disponibles.");
       }

       System.out.println("\nIntentando devolver un ejemplar de Libro 1...");
       if (libro1.devolucion()) {
           System.out.println("Devolución exitosa... Estado actual: " + libro1.toString());
       } else {
           System.out.println("Devolución fallida!!! \n No hay ejemplares prestados.");
       }

       System.out.println("---------------------------\n");

       // Prueba con objeto libro2
       System.out.println("Pruebas con Libro 2:");
       System.out.println("Intentando prestar un ejemplar de Libro 2...");
       if (libro2.prestamo()) {
           System.out.println("Préstamo exitoso ...!\n");
           System.out.println("Estado actual: " + libro2.toString());
       } else {
           System.out.println("\nPréstamo fallido. No hay ejemplares disponibles.");
       }

       System.out.println("\nPrueba metodo devolver en objeto Libro 2...");
       if (libro2.devolucion()) {
           System.out.println("\nDevolución exitosa");
           System.out.println("\nEstado actual: " + libro2.toString());
       } else {
           System.out.println("\nDevolución fallida... No hay ejemplares prestados.\n");
       }

       // Probar el nuevo método esDisponible()
        System.out.println("Probando el método disponible()...");
        int cantidadSolicitada = 3;
        System.out.println("Libro 1 tiene " + (libro1.getNumeroEjemplares() - libro1.getNumeroEjemplaresPrestados()) + " ejemplares disponibles.");
        if (libro1.disponible(cantidadSolicitada)) {
            System.out.println("El Libro 1 tiene " + cantidadSolicitada + " ejemplares disponibles para préstamo.");
        } else {
            System.out.println("El Libro 1 NO tiene " + cantidadSolicitada + " ejemplares disponibles para préstamo.");
        }

       System.out.println("\n********************");
       System.out.println("         F I N");
       System.out.println("********************\n");

       scanner.close();
   }

}

