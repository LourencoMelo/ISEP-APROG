import java.util.Scanner;

public class ExB {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nAlunos, nDisciplinas, positivas, negativas;
        String disciplina;
        nAlunos = ler.nextInt();
        nDisciplinas = ler.nextInt();
        for (int i = 0; i < nDisciplinas; i++) {
            disciplina = ler.next();
            positivas = ler.nextInt();
            negativas = nAlunos - positivas;
            System.out.println("Disciplina: " + disciplina);
            System.out.println("- Positivas: " + notas(positivas));
            System.out.println("- Negativas: " + notas(negativas));
        }
    }

    //========================================================
    
    public static String notas(int numero) {
        String asterisco, nota = "", vazio = "";
        asterisco = "*";
        boolean flag = false;
        for (int i = 1; i <= numero; i++) {
            nota = nota + asterisco;
            flag = true;
        }
        if (flag == true) {
            return nota;
        } else {
            return vazio;
        }
    }
}