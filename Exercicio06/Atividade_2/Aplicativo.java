package Exercicio06.Atividade_2;

public class Aplicativo {
    public static void main(String[] args) {

        System.out.println("#############################################################################");

    //######## Assalariado ########//
        Assalariado a1 = new Assalariado("Sofia", "Assistente de RH", 1400);
        a1.Status();
        System.out.println("");
    //########## Horista ##########//
        Horista h1 = new Horista("Pedro","Dev. Junior PJ",50,40);
        h1.Status();
        System.out.println("");

    //####### Comissionado #######//
        Comissionado c1 = new Comissionado("Patricia","Assitente de vendas", 150,15);
        c1.Status();

        System.out.println("#############################################################################");


    }
}
