

import java.util.Scanner;

public class ExH {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, n = 0;
        boolean capicua = false;
        while (n < 5 && capicua == false) {
            numero = ler.nextInt();
            capicua = capicua(numero);
            if (capicua == false) {
                n++;
            }
        }
        if (capicua == true){
            System.out.println("capicua");
        }else{
            System.out.println("tentativas excedidas");
        }
    }

    //====================================================================================
    
    public static boolean capicua(int numero) {
        int algarismo, aux = numero, numero1 = 0;
        boolean flag = false;
        while (aux > 0) {
            algarismo = aux % 10;
            aux /= 10;
            numero1 = numero1 * 10 + algarismo;
        }
        if (numero == numero1) {
            flag = true;
        }
        return flag;
    }
}
