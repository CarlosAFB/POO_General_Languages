package Exercicio02.Atividade_4;

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        String posicao;
        int valida = 0;
        int jogadas = 0;

        while(true){
            System.out.println("|######:::.. JOGO DA VELHA ..:::######|");
            jogo.JogoDaVelha();

            do {
                System.out.print("Jogador 1, informe a posição: ");
                posicao = ler.next();

                while (!jogo.valido(posicao)){
                    System.out.println("Jogada inválida, tente novamente!!");
                    System.out.print("Jogador 1, informe a posição: ");
                    posicao = ler.next();
                    valida = 0;
                }
                jogo.jogada(posicao, "X");
                valida = 1;

            }while (valida == 0);

            jogadas++;
            valida = 0;
            jogo.JogoDaVelha();
            if(!jogo.ganhou(jogadas).equals("null")){
                break;
            }

            do {
                System.out.print("Jogador 2, informe a posição: ");
                posicao = ler.next();

                while (!jogo.valido(posicao)){
                    System.out.println("Jogada inválida, tente novamente!!");
                    System.out.print("Jogador 2, informe a posição: ");
                    posicao = ler.next();
                    valida = 0;
                }
                jogo.jogada(posicao, "O");
                valida = 1;
            }while (valida == 0);

            jogadas++;
            valida = 0;
            jogo.JogoDaVelha();
            if(!jogo.ganhou(jogadas).equals("null")){
                break;
            }

        }
        System.out.println("O " + jogo.ganhou(jogadas)+ " venceu!!");
        System.out.println("|###########:::::... ...:::::##########|");
    }
}
