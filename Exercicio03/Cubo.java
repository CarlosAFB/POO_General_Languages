package Exercicio03;

public class Cubo extends Tridimensional {
    //------------------- Atributos -------------------//
    private double comprimento;

    //--------------- Metodos Construtor ---------------//

    public Cubo(double altura, double largura, double comprimento) {
        super.setLados(8);
        super.setAltura(altura);
        super.setLargura(largura);
        this.setComprimento(comprimento);
    }


    //--------------- Metodos Especiais ---------------//
    @Override
    public void exibaObjeto(){
        System.out.println("Esse é um objeto do tipo Cubo.");
    }

    public void volumeMetrosQuadrados(){
        double m2;

        m2 = getLargura() * getAltura() * getComprimento();

        System.out.println("O volume em metros quadrados desse Cubo é: " +m2+ "m².");
    }

    public void numDeLados(){
        System.out.println("Número de lados:" + getLados());
    }


    //--------------- Metodos Acessores ---------------//
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if(comprimento < 0)
            System.out.println("Não existem valores negativos para as propriedades das formas geométricas.");
        else
            this.comprimento = comprimento;
    }
}
