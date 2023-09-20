

import java.util.Scanner;

public class ExA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra;
        boolean x;
        int contador = 0;
        do {
            palavra = ler.next(); // lê uma string até encontrar um separador
            x = polindromo(palavra);
            if (x == false) {
                contador++;
            }
        } while (x == false);
        System.out.println(contador);
    }
    
    //========================================================================================================

    public static boolean polindromo(String palavra) {
        int contador = 0;
        boolean flag = false;
        for (int i = 0; i <= palavra.length() - 1; i++) {
            if (palavra.charAt(i) == palavra.charAt(palavra.length() - 1 - i)) {
                contador++;
            }
        }
        if (contador == palavra.length()) {
            flag = true;
        }
        return flag;
    }
}
