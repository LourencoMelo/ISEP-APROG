

import java.util.Scanner;

public class ExC {

    public static double calcAng(double a, double b, double c) {
        double angulo;
        angulo = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
        return angulo;
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner ler = new Scanner(System.in);
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();
        if (a > 0 && b > 0 && c > 0) {
            if (Math.abs(a-b) < c && c < (a + b) && Math.abs(a-c) < b && b < (a + c) && Math.abs(b-c) < a && a < (b + c)){
                System.out.println("a=" + (int)a);
                System.out.println("b=" + (int)b);
                System.out.println("c=" + (int)c);
                System.out.println("ang(a,b)=" + (int)calcAng(a, b, c));
                System.out.println("ang(a,c)=" + (int)calcAng(a, c, b));
                System.out.println("ang(b,c)=" + (int)calcAng(b, c, a));
            }else{
                System.out.println("impossivel");
            }
        }else{
            System.out.println("impossivel");
        }
    }
}