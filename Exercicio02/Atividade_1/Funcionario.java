package Exercicio02.Atividade_1;

public class Funcionario {
//------------- Atributos -------------//
    private String nome;
    private String sobrenome;
    private float salario;

//--------- Metodo Construtor ---------//

    public Funcionario() {
        this.setNome("Indefinido");
        this.setSobrenome("");
        this.setSalario(0);
    }

    public Funcionario(String nome, String sobrenome, float salario) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSalario(salario);
    }

//-------------- Metodos Especiais --------------//
    public float aumento(float porcentagem){
        float a;
        a = ((getSalario()*(porcentagem / 100) + getSalario()));
        setSalario(a);
        System.out.println(getNome()+ " teve um aumento de " +porcentagem+ "% é passa a receber "+ a +" reais.");
        return a;
    }
    public float salarioAnual(){
        float aux = getSalario() * 12;
        System.out.println("O salario anual de " +getNome()+ " é de " +aux+ " reais.");
        return aux;
    }

//--------- Metodos Acessores ---------//
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        if (salario < 0){
            this.salario = 0.0F;
            System.out.println("Valor de salário negativo!");
        }
        else{
            this.salario = salario;
        }
    }
}
