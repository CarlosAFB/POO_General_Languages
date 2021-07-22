package Exercicio03;

public class Bidimensional {
    //------------------- Atributos -------------------//
    private double altura;
    private double largura;
    private int lados;
    public static final double $PI = 3.14;

    //--------------- Metodos Especiais ---------------//
    public void areaMetrosQuadrados(){}

    public void exibaObjeto(){
        System.out.println("Esse é um objeto Bidimensional");
    }

    public void numDeDimencoes(){
        System.out.println("O objeto é bidimensional, é possui 2 dimensões");
    }

    public static double potencia(double base, int expoente){
        if( base == 1 && expoente == 0)
            return 1;
        else if( expoente > 1)
            return base * potencia(base,expoente - 1);
        return base;
    }

    //--------------- Metodos Acessores ---------------//
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if(altura < 0)
            System.out.println("Não existem valores negativos para as propriedades das formas geométricas.");
        else
            this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        if(largura < 0)
            System.out.println("Não existem valores negativos para as propriedades das formas geométricas.");
        else
            this.largura = largura;
    }

    public int getLados() {
        return lados;
    }
    public void setLados(int lados) {
        if(lados < 0)
            System.out.println("Não existem valores negativos para as propriedades das formas geométricas.");
        else
            this.lados = lados;
    }
}
