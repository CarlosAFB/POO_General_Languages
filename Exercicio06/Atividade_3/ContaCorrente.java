package Exercicio06.Atividade_3;

public class ContaCorrente extends ContaBancaria implements IAtualizaSaldo, ITaxaDeOperacao{
//-------------- Metodos Construtor --------------//
    public ContaCorrente(String cliente, double saldo){
        super.setCliente(cliente);
        super.setSaldo(saldo);
    }

//--------------- Metodos Acessores ---------------//
    @Override
    public double projetarSaldoMensal() {
        setSaldo(getSaldo()-15);                    //Taxa de Manutençao
        setSaldo(getSaldo()+(getSaldo()*0.05));     //Rentabilidade por juros
        return getSaldo();
    }

    @Override
    public double calcularTaxaDeSaque() {
        setSaldo(getSaldo()-0.10);
        return getSaldo();
    }
}
