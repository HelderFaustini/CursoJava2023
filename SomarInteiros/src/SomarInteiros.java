//Biblioteca de leitura de dados - interação - entrada
import java.util.Scanner;

public class SomarInteiros {
    public static void main(String[] args) throws Exception {
        
        try(Scanner entrada = new Scanner(System.in)) {

            int nro1 = 0;
            int nro2 = 0;
            int soma = 0;

            System.out.print("Digite o 1º número: ");
            nro1 = entrada.nextInt();

            System.out.print("Digite o 2º número: ");
            nro2 = entrada.nextInt();

            soma = nro1 + nro2;

            System.out.printf("Soma é: %d%n", soma);


        }
    }
}
