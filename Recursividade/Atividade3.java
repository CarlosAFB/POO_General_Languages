// Instituto Federal de Goiás - Luziânia
// Sistemas de Informação - Programação II
// Carlos Alexandre Fernandes Batista  - 20191080080099
// 17 de Janeiro de 2021

/** Desenvolva um algoritmo que calcule e mostre o maior elemento de um vetor de inteiros de tamanho n . **/

package Recursividade;

public class Atividade3 {
    public static void main(String[] args) {
        int v[] = {5,2,1,42,4,6,4,7,7,21,36,5}; // <-------- Altere os elementos do vetor.
        int maior = BuscarMaior(v,0, v.length-1);

        System.out.println("O maior valor do vetor é: " + maior);
    }

    public static int BuscarMaior(int v[], int i, int f){
        if (i == f){
            return v[i];
        }else{
            int n1, n2;
            int m;

            m = (i + f)/2;
            n1 = BuscarMaior(v, i, m);
            n2 = BuscarMaior(v, m+1, f);

            if (n1 > n2)
                return n1;
            else
                return n2;
        }
    }
}
