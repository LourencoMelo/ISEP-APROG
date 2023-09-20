

import java.util.Scanner;

public class ExD {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int m, n;
        m = ler.nextInt();
        n = ler.nextInt();
        if (m >= n){
        System.out.println("C(" + m + "," + n + ")=" + combinacoes(m,n));
        System.out.println("P(" + m + "," + n + ")=" + permutacoes(m,n));
        }
    }
    
    //==================================================================
    
    public static int fatorial(int numero){
        int fatorial = 1;
        boolean flag = false;
        for (int i = numero; i >= 1; i--){
            fatorial = fatorial * i;
            flag = true;
        }
        if (flag == true){
            return fatorial;
        }else{
            return 1;
        }
    }
    
    //==================================================================
    
    public static int combinacoes(int m, int n){
        int combinacoes;
        int x = m-n;
        combinacoes = fatorial(m) / (fatorial(n) * fatorial(x));
        return combinacoes;
    }
    
    //===================================================================
    
    public static int permutacoes(int m, int n){
        int permutacoes;
        permutacoes = fatorial(m) / fatorial(m-n);
        return permutacoes;
    }
}
