

import java.util.Scanner;

public class ExG{
    
    public static void main (String[] args){
        int n;
        boolean numero;
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();
        for (int i = 0; i <= n; i++){
            numero = armstrong(i);
            if (numero == true){
                System.out.println(i);
            }
        }
    }
    
    //================================================================================================
    
    public static boolean armstrong(int numero){
        int algarismo, aux, numero1 = 0, quantidade = 0;
        boolean flag = false;
        aux = numero;
        while (aux > 0){
            aux /= 10;
            quantidade++;
        }
        aux = numero;
        while (aux > 0){
            algarismo = aux % 10;
            aux /= 10;
            numero1 = numero1 + (int)Math.pow(algarismo, quantidade);
        }
        if (numero1 == numero){
            flag = true;
        }
        return flag;
    }
}
