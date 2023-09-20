

import java.util.Scanner;

public class ExF {

    public static void main(String[] args) {
        String solido;
        double volume, raio, altura;
        Scanner ler = new Scanner(System.in);
        solido = ler.next();
        while (!solido.equals("fim")) {
            if (solido.equals("esfera")) {
                raio = ler.nextDouble();
                volume = esfera(raio);
                System.out.printf("%.2f%n", volume);
            } else {
                if (solido.equals("cilindro")) {
                    raio = ler.nextDouble();
                    altura = ler.nextDouble();
                    volume = cilindro(raio, altura);
                    System.out.printd("%.2f%n", volume);
                } else {
                    if (solido.equals("cone")) {
                        raio = ler.nextDouble();
                        altura = ler.nextDouble();
                        volume = cone(raio, altura);
                        System.out.printf("%.2f%n", volume);
                    }
                }
            }
            solido = ler.next();
        }
    }

    //====================================================================================================================
    public static double esfera(double raio) {
        double volume;
        volume = (4 * Math.PI * Math.pow(raio, 3)) / 3;
        return volume;
    }

    //===================================================================================================================
    public static double cilindro(double raio, double altura) {
        double volume;
        volume = Math.PI * Math.pow(raio, 2) * altura;
        return volume;
    }

    //===================================================================================================================
    public static double cone(double raio, double altura) {
        double volume;
        volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;
        return volume;
    }
}
