/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
import java.util.Scanner;
public class numperfeito {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int limite,contador=0,div=1,n=1,nperfeito=0;
        limite=ler.nextInt();
        while(contador!=limite){
            while(n>div){
                if(n%div==0){
                    nperfeito+=div;
                    contador++;
                }
                div++;
                
            }
            if(nperfeito==n){
                System.out.println(n);
            }
        }
        
    }
}       
        