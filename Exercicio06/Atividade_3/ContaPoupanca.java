package Exercicio06.Atividade_3;

public class ContaPoupanca extends ContaBancaria implements IAtualizaSaldo, ITaxaDeOperacao{
//-------------- Metodos Construtor --------------//
    public ContaPoupanca(String cliente, double saldo){
        super.setCliente(cliente);
        super.setSaldo(saldo);
    }

//--------------- Metodos Especias ---------------//
    @Override
    public double projetarSaldoMensal() {
        setSaldo(getSaldo()+(getSaldo()*0.01));
        return getSaldo();
    }

    @Override
    public double calcularTaxaDeSaque() {
        return 0;
    }

    @Override
    public void setSaldo(double saldo) {
        if(saldo < 0)
            System.out.println("Não é possivel existir Conta Poupança com valor negativo!");
        else
            super.setSaldo(saldo);
    }


}
