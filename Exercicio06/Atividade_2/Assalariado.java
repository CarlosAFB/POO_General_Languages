package Exercicio06.Atividade_2;

public class Assalariado extends Funcionario implements IPagar{
//------------------- Atributos -------------------//
    private double salarioMensal;

//---------------- Metodo Construtor --------------//
    public Assalariado(String nome, String cargo, double salarioMensal) {
        super.setNome(nome);
        super.setCargo(cargo);
        this.setSalarioMensal(salarioMensal);
    }

//--------------- Metodos Abstratos ---------------//
    @Override
    public double calcularTotalAPagar() {
        return getSalarioMensal();
    }

//--------------- Metodos Especias ---------------//
    public void Status(){
        System.out.println("O funcionário " +getNome()+ " com cargo " +getCargo()+ " deverá receber R$" +calcularTotalAPagar()+".");
    }

//--------------- Metodos Acessores ---------------//
    public double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
