package Exercicio03;

public class Triangulo extends Bidimensional {
    //--------------- Metodos Construtor ---------------//
    public Triangulo(double altura, double largura) {
        super.setLados(3);
        super.setAltura(altura);
        super.setLargura(largura);
    }

    //--------------- Metodos Especiais ---------------//
    @Override
    public void exibaObjeto(){
        System.out.println("Esse é um objeto Triãngulo.");
    }

    @Override
    public void areaMetrosQuadrados(){
        double m2;

        m2 = getAltura() * (getLargura() / 2);

        System.out.println("A área em metros quadrados desse Triângulo é :" +m2+ "m².");
    }

    public void numDeLados(){
        System.out.println("Número de lados:" + getLados());
    }

}
