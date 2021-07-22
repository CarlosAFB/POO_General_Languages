// Instituto Federal de Goiás - Luziânia
// Sistemas de Informação - Programação II
// Carlos Alexandre Fernandes Batista  - 20191080080099
// 17 de Janeiro de 2021

/** 1. Desenvolva um algoritmo que calcule o número fatorial de um número n . **/

package Recursividade;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        int n;

        System.out.print("---- Calcular Fatorial ---- \nDigite o valor a ser calculado: ");
        n = Ler.nextInt();

        System.out.println("O resultado do fatorial de " + n + " é: " + Fatorial(n));
    }

    public static int Fatorial( int n ){
        if(n == 0)
            return 1;
        else
            return n * Fatorial( n - 1 );
    }
}
