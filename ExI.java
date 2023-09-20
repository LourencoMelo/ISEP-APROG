import java.util.Scanner;

public class ExI {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] casa;
        casa = preencher();
        String nome = ler.nextLine();
        procurar(casa, nome);
    }

    public static String[][] preencher() {
        String[][] casa = new String[4][3];
        for (int x = 0; x <= 2; x++) {
            for (int y = 3; y >= 0; y--) {
                casa[y][x] = ler.nextLine();
            }
        }
        return casa;
    }
    
    public static void procurar (String[][] casa, String nome){
        boolean flag = false;
        for (int x = 0; x <= 2; x++){
            for (int y = 3; y >= 0; y--){
                if (casa[y][x].equals(nome)){
                    System.out.println("nome=" + nome);
                    System.out.println("entrada=" + x);
                    System.out.println("piso=" + (3 - y));
                    flag = true;
                }
            }
        }
        if (flag == false){
            System.out.println("Nao mora no predio");
        }
    }
}