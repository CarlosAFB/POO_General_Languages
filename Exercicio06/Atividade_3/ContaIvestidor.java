package Exercicio06.Atividade_3;

import java.text.DecimalFormat;

public class ContaIvestidor extends ContaBancaria implements IAtualizaSaldo, ITaxaDeOperacao{
    DecimalFormat formato = new DecimalFormat("#.##");
//------------------- Atributos -------------------//
    private double taxaSelic;

//-------------- Metodos Construtor --------------//
    public ContaIvestidor(String cliente, double saldo){
        super.setCliente(cliente);
        super.setSaldo(saldo);
    }

//--------------- Metodos Especias ---------------//
    @Override
    public double projetarSaldoMensal() {
        setTaxaSelic(2.75);

        setSaldo(getSaldo()+(getSaldo()*(getTaxaSelic()/10)));     //Selic
        setSaldo(Double.valueOf(formato.format(getSaldo())));
        return getSaldo();
    }


    @Override
    public double calcularTaxaDeSaque() {
        setSaldo(getSaldo() - (getSaldo()*0.38));
        return getSaldo();
    }

    @Override
    public void setSaldo(double saldo) {
        if(saldo < 0)
            System.out.println("Não é possivel existir Conta Investidor com valor negativo!");
        else
            super.setSaldo(saldo);
    }
//--------------- Metodos Acessores ---------------//
    public double getTaxaSelic() {
        return taxaSelic;
    }
    public void setTaxaSelic(double taxaSelic) {
        this.taxaSelic = taxaSelic;
    }
}