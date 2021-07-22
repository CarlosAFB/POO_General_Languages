package Exercicio06.Atividade_3;

public class Aplicativo {
    public static void main(String[] args) {

        System.out.println("####################::.. Banco ..::#######################");

        //######## Conta Corrente ########//
        System.out.println("Conta Corrente:");
        ContaCorrente c1 = new ContaCorrente("Maria", 2500);

        c1.depositarCheque(100);
        c1.depositarDinheiro(250);

        c1.sacar(500);

        c1.imprimaSaldo();

        System.out.println("");


        //######## Conta Poupança ########//
        System.out.println("Conta Poupança:");
        ContaPoupanca p1 = new ContaPoupanca("Maria", 1500);

        p1.depositarCheque(300);
        p1.depositarDinheiro(50);

        p1.sacar(200);

        p1.imprimaSaldo();

        System.out.println("");


        //####### Conta Investidor #######//
        System.out.println("Conta Investidor:");
        ContaIvestidor i1 = new ContaIvestidor("Maria", 2000);

        i1.depositarCheque(100);
        i1.depositarDinheiro(250);

        i1.sacar(500);

        i1.imprimaSaldo();

        System.out.println("");


        //####### Soma Total das contas #######//
        double total = (c1.getSaldo() +p1.getSaldo()+i1.getSaldo());
        System.out.println("Soma Total das contas: "+ total);


        System.out.println("##########################################################");


    }
}
