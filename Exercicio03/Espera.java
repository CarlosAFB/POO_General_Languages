package Exercicio03;

public class Espera extends Tridimensional {
    //------------------- Atributos -------------------//
    private double raio;

    //--------------- Metodos Construtor ---------------//
    public Espera(double raio) {
        this.setRaio(raio);
    }

    //--------------- Metodos Especiais ---------------//
    @Override
    public void exibaObjeto(){
        System.out.println("Esse é um objeto do tipo Esfera.");
    }
    public void areaMetrosQuadrados() {
        double m2;
        m2 = (4 * super.$PI) * (potencia(getRaio(),3) / 3);

        System.out.println("O volume em metros quadrados dessa esfera é: " + m2 + "m².");
    }
    public void numDeLados(){
        System.out.println("A esfera não possui numero de lados.");
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
