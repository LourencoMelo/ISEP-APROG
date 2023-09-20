

import java.util.Scanner;

public class ExI {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        boolean x;
        numero = ler.nextInt();
        x = fibonacci(numero);
        if (x == true){
            System.out.println("e de Fibonacci");
        }else{
            System.out.println("nao e de Fibonacci");
        }
    }

    //===========================================================================
    
    public static boolean fibonacci(int numero) {
        int numero1 = 1, a, b = 0;
        boolean flag = false;
        if (numero == 0) {
            flag = true;
        } else {
            if (numero == 1) {
                flag = true;
            } else {
                for (int i = 1; i <= numero; i++) {
                    a = b;
                    b = numero1;
                    numero1 = b + a;
                    if (numero == numero1){
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
