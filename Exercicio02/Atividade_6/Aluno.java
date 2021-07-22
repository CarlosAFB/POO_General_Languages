package Exercicio02.Atividade_6;

public class Aluno extends Pessoa{

    //----------- Atributos ----------//
    int matricula;
    String Curso;

    //------------ Metodos -----------//
    public void pagarMensal(){
        System.out.println("Pagar mensalidade do aluno: " + this.getNome());
    }
    public void cancCurso(){
        System.out.println("Matricula será cancelada.");
    }

    //------- Metodos Acessores ------//
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }
    public void setCurso(String curso) {
        Curso = curso;
    }

}
