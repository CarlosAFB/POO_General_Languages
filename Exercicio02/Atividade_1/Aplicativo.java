package Exercicio02.Atividade_1;

public class Aplicativo {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("José", "Paulo", 1550);
        Funcionario f2 = new Funcionario("Pedro", "Vasconcelos", 2000);

        f1.aumento(10);
        f2.aumento(10);

        f1.salarioAnual();
        f2.salarioAnual();

    }
}
