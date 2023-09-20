import java.util.Scanner;

public class ExE {

    public static int algarismos(int numero1, int numero2) {
        int algarismo1, algarismo2, quantidade = 0;
        while (numero1 > 0 && numero2 > 0) {
            algarismo1 = numero1 % 10;
            numero1 /= 10;
            algarismo2 = numero2 % 10;
            numero2 /= 10;
            if (algarismo1 == algarismo2) {
                quantidade++;
            }
        }
        return quantidade;
    }

    //========================================================================================================
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, numero1, numero2, mais = 0, quantidade = 0, x = 0, y = 0;
        n = ler.nextInt();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                numero1 = ler.nextInt();
                numero2 = ler.nextInt();
                quantidade = algarismos(numero1, numero2);
                if (mais <= quantidade) {
                    mais = quantidade;
                    x = numero1;
                    y = numero2;
                }
            }
            if (mais != 0) {
                System.out.println(x + "/" + y);
            } else {
                System.out.println("sem resultados");
            }
        }
    }
}
