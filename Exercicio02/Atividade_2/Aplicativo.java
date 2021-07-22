package Exercicio02.Atividade_2;

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int d,m, a;

        Proprietario p1 = new Proprietario(
                "carlos",
                70703687123L,
                66445);


        System.out.println("Digite o dia que você nasceu: ");
        d = ler.nextInt();
        System.out.println("Digite o mês que você nasceu: ");
        m = ler.nextInt();
        System.out.println("Digite o ano que você nasceu: ");
        a = ler.nextInt();
        p1.calculaidade(d,m,a);

        p1.vericadorCPF();
    }

}
