

import java.util.Scanner;

public class ExJ {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        numero = ler.nextInt(); 
        if (numero <= 100 && numero >= 0){
        System.out.println(tentativas(numero));
        }
    }

    public static int tentativas(int secreto) {
        for (int i = 0; i < 30; i++){
            System.out.println();
        }
        int numero, tentativas = 1;
        numero = ler.nextInt();
        while (numero != secreto) {
            if (numero > secreto) {
                System.out.println("Tente menor");
            } else {
                System.out.println("Tente maior");
            }
            numero = ler.nextInt();
            tentativas++;
        }
        System.out.println("Acertou");
        return tentativas;
    }
}
