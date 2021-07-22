package Exercicio06.Atividade_1;

public class Subtracao implements OperacaoAritmetica{

    @Override
    public int calcular(int a, int b) {
        return (a - b);
    }

    @Override
    public double calcular(double a, double b) {
        return (a - b);
    }
}
