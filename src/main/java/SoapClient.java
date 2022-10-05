import utez.Service;
import utez.ServiceService;

import java.util.Scanner;

public class SoapClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Adivinar numero");
            System.out.println("2. Quitar vocales");
            System.out.println("3. RFC");
            System.out.println("4. Salir");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    ServiceService service = new ServiceService();
                    Service port = service.getServicePort();
                    System.out.println("Ingresa un numero");
                    String response = port.adivinarNumero(scanner.nextInt());
                    System.out.println(response);
                    break;

                case 2:
                    ServiceService service2 = new ServiceService();
                    Service port2 = service2.getServicePort();
                    System.out.println("Ingrese una frase");
                    String response2 = port2.consonantes(scanner.next());
                    System.out.println(response2);
                    break;

                case 3:
                    ServiceService service3 = new ServiceService();
                    Service port3 = service3.getServicePort();
                    System.out.println("Ingrese los datos");
                    System.out.println("Nombre");
                    String nombre = scanner.next();
                    System.out.println("Apellido Paterno");
                    String apellidoP = scanner.next();
                    System.out.println("Apellido Materno");
                    String apellidoM = scanner.next();
                    System.out.println("Fecha de nacimiento (dd/mm/aaaa)");
                    String fechaNac = scanner.next();
                    String response3 = port3.rfc(nombre, apellidoP, apellidoM, fechaNac);
                    System.out.println(response3);
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        }while (option != 4);
    }
}