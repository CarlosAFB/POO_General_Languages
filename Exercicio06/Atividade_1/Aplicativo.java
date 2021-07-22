package Exercicio06.Atividade_1;

public class Aplicativo {
    public static void main(String[] args) {

        System.out.println("########################################");

        Soma s1 = new Soma();
        System.out.println("Soma Resultado: " + s1.calcular(5,2));

        Subtracao s2 = new Subtracao();
        System.out.println("Subtração Resultado: "+ s2.calcular(10,5));

        Multiplicacao m1 = new Multiplicacao();
        System.out.println("Multiplicação Resultado: "+ m1.calcular(5,5));

        Divisão d1 = new Divisão();
        System.out.println("Divisão Resultado: "+ d1.calcular(10,5));

        System.out.println("########################################");

    }
}
