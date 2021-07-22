package Exercicio03;// Instituto Federal de Goiás - Luziânia
// Sistemas de Informação - Programação II
// Carlos Alexandre Fernandes Batista  - 20191080080099
// 04 de Março de 2021

public class Aplicativo {
    public static void main(String[] args) {

        //Classe Quadrado
        System.out.println("####################################################\nClasse Quadrado:");
        Quadrado q1 = new Quadrado(5,5);

        q1.exibaObjeto();
        q1.numDeLados();
        q1.numDeDimencoes();
        q1.areaMetrosQuadrados();
        System.out.println("####################################################");
        System.out.println("");

        //Classe Cubo
        System.out.println("####################################################\nClasse Cubo:");
        Cubo cb1 = new Cubo(4,4,4);

        cb1.exibaObjeto();
        cb1.numDeLados();
        cb1.numDeDimencoes();
        cb1.volumeMetrosQuadrados();

        System.out.println("####################################################");
        System.out.println("");

        //Classe Circulo
        System.out.println("####################################################\nClasse Circulo:");
        Circulo ci1 = new Circulo(2);

        ci1.exibaObjeto();
        ci1.numDeLados();
        ci1.numDeDimencoes();
        ci1.areaMetrosQuadrados();

        System.out.println("####################################################");
        System.out.println("");

        //Classe Esfera
        System.out.println("####################################################\nClasse Esfera:");
        Espera sp1 = new Espera(2);

        sp1.exibaObjeto();
        sp1.numDeLados();
        sp1.numDeDimencoes();
        sp1.areaMetrosQuadrados();

        System.out.println("####################################################");
        System.out.println("");

        //Classe Triangulo
        System.out.println("####################################################\nClasse Triângulo:");
        Triangulo tri = new Triangulo(2,6);

        tri.exibaObjeto();
        tri.numDeLados();
        tri.numDeDimencoes();
        tri.areaMetrosQuadrados();

        System.out.println("####################################################");
        System.out.println("");

        //Classe Tetraedro
        System.out.println("####################################################\nClasse Tetraedro:");
        Tetraedro tet = new Tetraedro(7);

        tet.exibaObjeto();
        tet.numDeLados();
        tet.numDeDimencoes();
        tet.volumeMetrosQuadrados();

        System.out.println("####################################################");
        System.out.println("");

    }
}
