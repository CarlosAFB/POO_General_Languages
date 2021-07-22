package Recursividade;

public class PotenciaAux {

    public static void main(String[] args) {

        System.out.println(potencia(7,2));
    }

    public static int potencia(int base, int expoente){
        if( base == 1 && expoente == 0)
            return 1;
        else if( expoente > 1)
            return base * potencia(base,expoente - 1);
        return base;
    }
    }

