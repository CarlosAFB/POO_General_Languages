// Instituto Federal de Goiás - Luziânia
// Sistemas de Informação - Programação II
// Carlos Alexandre Fernandes Batista  - 20191080080099
// 17 de Janeiro de 2021

/** 2. Desenvolva um algoritmo que calcule a soma dos elementos (inteiros) de um vetor de tamanho n. **/

package Recursividade;
public class Atividade2 {

    public static void main(String[] args) {

        int v[] = {2,5,8,9,2,9,10}; //<-------- Altere os elementos do vetor.
        int soma = Soma(v, 0);

        System.out.println("Resultado da soma dos vetores: " + soma);

    }

    public static int Soma(int v[], int i){
        if(i < v.length) {
            return v[i] + Soma(v,i + 1);
        }
        else{
            return 0;
        }
    }
}
