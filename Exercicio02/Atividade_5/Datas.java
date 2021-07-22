package Exercicio02.Atividade_5;

import java.util.Calendar;

public class Datas {

    Calendar date = Calendar.getInstance();

//------------- Atributos -------------//
    private int dia;
    private int mes;
    private int ano;
//--------- Metodo Construtor ---------//

    public Datas(int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public Datas() {
        this.setDia(date.get(Calendar.DAY_OF_MONTH));
        this.setMes(date.get(Calendar.MONTH) + 1);
        this.setAno(date.get(Calendar.YEAR));
    }

//-------------- Relatório Estado ---------------//
    /*public void relatorio() {
        System.out.println("");
        System.out.println("####################################");
        System.out.println("Dia: " + this.getDia());
        System.out.println("Mês: " + this.getMes());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Data: " + this.getDia()+ "/" + this.getMes() + "/" + this.getAno());
        System.out.println("####################################");
        System.out.println("");
    }*/
//-------------- Metodos Especiais --------------//
    @Override
    public String toString() {
        return "Data: " + this.getDia() + "/" + this.getMes() + "/" + this.getAno();
    }

    public void avancardia(){
        if (getDia() >= 31) {
            setDia(1);
            setMes(getMes());

            if (getMes() >= 12) {
                setMes(1);
                setAno(getAno() + 1);
            } else {
                setMes(getMes() + 1);
            }
        }
        else{
                setDia(getDia() + 1);
            }
    }

//--------- Metodos Acessores ---------//
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        if(dia >= 1 && dia <= 31)
            this.dia = dia;
        else
            System.out.println("O dia inserido é inválido!");
    }


    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        if(mes >= 1 && mes <= 12)
            this.mes = mes;
        else
            System.out.println("O mês inserido é inválido!");
    }


    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        if(ano >= 1)
            this.ano = ano;
        else
            System.out.println("O ano inserido é inválido!");
    }

}
