package Exercicio03;

public class Quadrado extends Bidimensional{

    //--------------- Metodos Construtor ---------------//
    public Quadrado(double altura, double largura) {
        super.setLados(4);
        super.setAltura(altura);
        super.setLargura(largura);
    }

    //--------------- Metodos Especiais ---------------//
    @Override
    public void exibaObjeto(){
        System.out.println("Esse é um objeto Quadrado.");
    }

    @Override
    public void areaMetrosQuadrados(){
        double m2;

        m2 = getAltura() * getLargura();

        System.out.println("A área em metros quadrados desse Quadrado é: " +m2+ "m².");
    }

    public void numDeLados(){
        System.out.println("Número de lados:" + getLados());
    }


}
