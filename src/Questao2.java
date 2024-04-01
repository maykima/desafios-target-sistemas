import java.util.*;
public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ehFibonacci;

        System.out.print("Digite um valor: ");

        int valor = sc.nextInt();

        if (valor == 0 || valor == 1){
            ehFibonacci = true;
        } else {
            int numeroA = 0;
            int numeroB = 1;

            while (valor > numeroB) {
                int numeroC = numeroA;
                numeroA = numeroB;
                numeroB += numeroC;
            }
            ehFibonacci = valor == numeroB;
        }

        System.out.println("É fibonacci: " + (ehFibonacci ? "Verdadeiro" : "Falso"));

        sc.close();
    }
}
