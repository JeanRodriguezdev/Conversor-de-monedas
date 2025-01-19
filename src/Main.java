import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);
        List<Monedas> moneda = new ArrayList<>();

        ConsultarConversion conversion = new ConsultarConversion();
        String monedaOrigen = "";
        String monedaDestino = "";
        System.out.println("bienvenido/a al Conversor de Monedas 🙂");
        while(true){
            System.out.println("1. Colones =>> Dolares");
            System.out.println("2. Dolares =>> Colones");
            System.out.println("3. Pesos Argentinos =>> Dolares");
            System.out.println("4. Dolares =>> Pesos Argentinos");
            System.out.println("5. Real brasileño =>> Dolares");
            System.out.println("6. Dolares =>> Real brasileño");
            System.out.println("7. Salir");
            System.out.println("Elija una opcion: ");
            try {
                var opcion = Integer.valueOf(teclado.nextInt());

                if(opcion == 1){
                    monedaOrigen = "CRC";
                    monedaDestino = "USD";
                }
                if(opcion == 2){
                    monedaOrigen = "USD";
                    monedaDestino = "CRC";
                }
                if(opcion == 3){
                    monedaOrigen = "ARS";
                    monedaDestino = "USD";
                }
                if(opcion == 4){
                    monedaOrigen = "USD";
                    monedaDestino = "ARS";
                }
                if(opcion == 5){
                    monedaOrigen = "BRL";
                    monedaDestino = "USD";
                }
                if(opcion == 6){
                    monedaOrigen = "USD";
                    monedaDestino = "BRL";
                }
                if(opcion == 7){
                    GenerarArchivo generador = new GenerarArchivo();
                    generador.guardarJson(moneda);
                    break;
                }

                System.out.println("Ingrese la cantidad a convertir: ");
                var cantidad = Double.valueOf(teclado.nextDouble());

                Conversor conversor = conversion.consultarConversion(monedaOrigen, monedaDestino);
                Monedas monedas = new Monedas(cantidad, monedaOrigen, monedaDestino);
                monedas.convertir(conversor);
                monedas.mostrarResultado();
                moneda.add(monedas);
            }
            catch (InputMismatchException e){
                System.out.println("Número no encontrado " + e.getMessage());
                break;
            }
            catch(RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación");
                break;
            }
        }
    }
}
