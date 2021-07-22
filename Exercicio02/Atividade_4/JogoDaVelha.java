package Exercicio02.Atividade_4;

public class JogoDaVelha {
//------------- Atributos -------------//
    private String[][] grade = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};

//-------------- Metodos Especiais --------------//
    public String JogoDaVelha(){
        for(int li = 0; li < 3; li++) {
            for (int co = 0; co < 3; co++) {
                System.out.printf("  |"+grade[li][co] + "|");
            }
            System.out.println("\n");
        }
        return null;
    }

    public boolean valido(String p){
        for( int li=0; li < 3; li++){
            for(int co=0; co <3; co++){
                if(grade[li][co].equals(p)){
                    return true;
                }
            }
        }
        return false;
    }

    public void jogada(String p, String j){
        if(p.equals("1")){
            grade[0][0] = j;
        }
        else if(p.equals("2")){
            grade[0][1] = j;
        }
        else if(p.equals("3")){
            grade[0][2] = j;
        }
        else if(p.equals("4")){
            grade[1][0] = j;
        }
        else if(p.equals("5")){
            grade[1][1] = j;
        }
        else if(p.equals("6")){
            grade[1][2] = j;
        }
        else if(p.equals("7")){
            grade[2][0] = j;
        }
        else if(p.equals("8")){
            grade[2][1] = j;
        }
        else if(p.equals("9")){
            grade[2][2] = j;
        }
    }

    public String ganhou(int jogadas){
        String[] t = new String[8];
        String vencedor = "null";

        if(jogadas == 9){
            System.out.println("EMPATE!!");
        }

        t[0] = grade[0][0] + grade[0][1] + grade[0][2];
        t[1] = grade[1][0] + grade[1][1] + grade[1][2];
        t[2] = grade[2][0] + grade[2][1] + grade[2][2];

        t[3] = grade[0][0] + grade[1][0] + grade[2][0];
        t[4] = grade[0][2] + grade[1][2] + grade[2][2];
        t[5] = grade[0][1] + grade[1][1] + grade[2][1];

        t[6] = grade[0][0] + grade[1][1] + grade[2][2];
        t[7] = grade[2][0] + grade[1][1] + grade[0][2];

        for(int i = 0; i < t.length; i++){
            if(t[i].equals("XXX")){
                vencedor = "Jogador 1";}

            else if(t[i].equals("OOO")){
                vencedor = "Jogador 2";
            }
        }
        return vencedor;
    }

}
