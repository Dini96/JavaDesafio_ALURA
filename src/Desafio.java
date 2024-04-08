import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Star";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo Disponible es: " + saldo + "$");
        System.out.println("\n****************************");

        String menu = """
                *** Escriba el número de la opción deseada ***
                1 - Consutlar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Su saldo es: " + saldo);
                    break;
                case 2:
                    System.out.println("¿Qué cantidad desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar){
                        System.out.println("Su saldo es insuficiente");
                    }else{
                        saldo-=valorARetirar;
                        System.out.println("Su saldo es de : " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Qué cantidad desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("Su saldo es de : " + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestro servicio, excelente día");
                    break;
                default:
                    System.out.println("La opción no es válida");
                    break;

            }

        }
    }
}
