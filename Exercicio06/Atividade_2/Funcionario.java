package Exercicio06.Atividade_2;

public abstract class Funcionario {
//------------------- Atributos -------------------//
    private String nome;
    private String cargo;

//---------------- Metodo Construtor --------------//
    public Funcionario(String nome, String cargo) {
        this.setNome(nome);
        this.setCargo(cargo);
    }

    public Funcionario() {
    }

    //--------------- Metodos Acessores ---------------//
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
