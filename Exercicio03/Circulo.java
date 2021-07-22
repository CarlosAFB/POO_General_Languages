package Exercicio03;

public class Circulo extends Bidimensional {
    //------------------- Atributos -------------------//
    private double raio;

    //--------------- Metodos Construtor ---------------//
    public Circulo(double raio) {
        this.setRaio(raio);
    }

    //--------------- Metodos Especiais ---------------//
    @Override
    public void exibaObjeto(){
        System.out.println("Esse é um objeto do tipo Circulo.");
    }
    public void areaMetrosQuadrados() {
        double m2;
        m2 = super.$PI * potencia(getRaio(), 2);

        System.out.println("A área em metros quadrados desse Circulo é: " + m2 + "m².");
    }
    public void numDeLados(){
        System.out.println("O circulo não possui numero de lados.");
    }

    //--------------- Metodos Acessores ---------------//
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        if(raio < 0)
            System.out.println("Não existem valores negativos para as propriedades das formas geométricas.");
        else
            this.raio = raio;
    }
}
