package Exercicio06.Atividade_2;

public class Comissionado extends Funcionario implements IPagar{
//------------------- Atributos -------------------//
    private double taxaDeComissao;
    private double totalEmVendas;

//---------------- Metodo Construtor --------------//
    public Comissionado(String nome, String cargo, double taxaDeComissao, double totalEmVendas) {
        super.setNome(nome);
        super.setCargo(cargo);
        this.setTaxaDeComissao(taxaDeComissao);
        this.setTotalEmVendas(totalEmVendas);
    }

//--------------- Metodos Abstratos ---------------//
    @Override
    public double calcularTotalAPagar() {
        return getTaxaDeComissao() * getTotalEmVendas();
    }

//--------------- Metodos Especias ---------------//
    public void Status(){
        System.out.println("O funcionário " +getNome()+ " com cargo " +getCargo()+ " deverá receber R$" +calcularTotalAPagar()+".");
    }

//--------------- Metodos Acessores ---------------//
    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }
    public void setTaxaDeComissao(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    public double getTotalEmVendas() {
        return totalEmVendas;
    }
    public void setTotalEmVendas(double totalEmVendas) {
        this.totalEmVendas = totalEmVendas;
    }
}
