package Exercicio06.Atividade_3;

public abstract class ContaBancaria implements ITaxaDeOperacao{
//------------------- Atributos -------------------//
    private double saldo;
    private String cliente;

//-------------- Metodos Construtor --------------//
    public ContaBancaria(String cliente, double saldo) {
        this.setCliente(cliente);
        this.setSaldo(saldo);
    }

    protected ContaBancaria() {
    }

//--------------- Metodos Especias ---------------//
    public void depositarCheque(double valor){
        setSaldo(getSaldo() + valor);
    }
    public void depositarDinheiro(int valor){
        setSaldo(getSaldo() + valor);
    }
    public double sacar(double valor){
        calcularTaxaDeSaque();
        setSaldo(getSaldo() - valor);
        return getSaldo();
    }
    public void imprimaSaldo(){
        System.out.println("O saldo de " +getCliente()+ ": R$" +getSaldo());
    }

    @Override
    public double calcularTaxaDeSaque() {
        return 0;
    }

//--------------- Metodos Acessores ---------------//
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
