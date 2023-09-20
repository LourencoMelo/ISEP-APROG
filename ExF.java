

import java.util.Scanner;

public class ExF {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        double[] taxas = new double[6];
        for (int i = 0; i < 6; i++) {
            taxas[i] = ler.nextDouble();
        }
        double inicial = ler.nextDouble();
        double valor = inicial;
        for (int i = 0; i < 6; i++) {
            valor += (valor * taxas[i]);
        }
        System.out.printf("valor final=%.2f%n", valor);
    }
}
