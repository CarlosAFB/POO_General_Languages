package Exercicio03;

public class Tetraedro extends Tridimensional {
    //--------------- Metodos Construtor ---------------//
    public Tetraedro(double altura) {
        super.setLados(4);
        super.setAltura(altura);
    }

    //--------------- Metodos Especiais ---------------//
    @Override
    public void exibaObjeto(){
        System.out.println("Esse é um objeto Tetraedro.");
    }

    @Override
    public void volumeMetrosQuadrados(){
        double m2;

        m2 = (potencia(getAltura(),3)) / (6 * Math.sqrt(2));

        System.out.println("O volume em metros quadrados desse Tetraedro é :" +m2+ "m².");
    }

    public void numDeLados(){
        System.out.println("Número de lados:" + getLados());
    }

}
