package Exercicio02.Atividade_6;

public class ProjetoPessoa {
    public static void main(String[] args) {
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Vistante p5 = new Vistante();

        p2.setNome("José");
        p3.setNome("Mariana");
        p4.setNome("Alice");

        p5.setNome("Luana");
        p5.setIdade(17);
        p5.setSexo("F");


        Bolsista b1 = new Bolsista();
        b1.setNome("Carlos");
        b1.setSexo("M");
        b1.setBolsa(12.5f);
        b1.toString();

        System.out.println(p5.toString());




    }
}
