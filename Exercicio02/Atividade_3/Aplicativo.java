package Exercicio02.Atividade_3;

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro(4, 30, 10, 150);
        Carro carro2 = new Carro(-8, -30, -10, -150);

        carro.acelerar();
        carro.exibirVelocidadeAtual();
        carro.acelerar();
        carro.exibirVelocidadeAtual();
        carro.acelerar();
        carro.exibirVelocidadeAtual();
        carro.acelerar();
        carro.exibirVelocidadeAtual();
        carro.freiar();
        carro.exibirVelocidadeAtual();
        carro.acelerar();
        carro.exibirVelocidadeAtual();
        carro.relatorio();
        carro.calcularCombustivelPorViagem(85);

        System.out.println("Informe a quilometragem desejada: ");
        Integer km = scanner.nextInt();
        carro.calcularCombustivelPorViagem(km);
        carro.calcularCombustivelPorViagem(950);

        carro2.acelerar();
        carro2.exibirVelocidadeAtual();
        carro2.acelerar();
        carro2.exibirVelocidadeAtual();
        carro2.acelerar();
        carro2.exibirVelocidadeAtual();
        carro2.acelerar();
        carro2.exibirVelocidadeAtual();
        carro2.freiar();
        carro2.exibirVelocidadeAtual();
        carro2.acelerar();
        carro2.exibirVelocidadeAtual();
        carro2.relatorio();

    }


}
