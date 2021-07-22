package Exercicio02.Atividade_6;

public class Professor extends Pessoa{

    //----------- Atributos ----------//
    String especialidade;
    float salario;

    //------------ Metodos -----------//
    public void receberAum(float aum){
        this.setSalario(getSalario() + aum);
    }

    //------- Metodos Acessores ------//
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
