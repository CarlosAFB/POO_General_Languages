package Exercicio02.Atividade_6;

public class Funcionario extends Pessoa{

    //----------- Atributos ----------//
    String setor;
    boolean trabalhando;

    //------------ Metodos -----------//
    public void mudarTrabalho(){
        this.setTrabalhando(!this.isTrabalhando());
    }

    //------- Metodos Acessores ------//
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
