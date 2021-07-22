package Exercicio05.src.uecombate;
import java.util.Random;

public class Lutas {

    //----------- Atributos ---------//
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //------------ Métodos ----------//
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
                this.setAprovada(true);
                setDesafiado(l1);
                setDesafiante(l2);
        }else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void luta(){

        if(this.isAprovada(true)){
            System.out.println("#--------------------------------#");
            this.getDesafiado().apresentar();
            System.out.println("#--------------------------------#");
            this.getDesafiante().apresentar();
            System.out.println("#--------------------------------#");


            Random  gerador = new Random();

            int vencedor = gerador.nextInt(3);

            switch (vencedor){
                case 0:
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Ganhador: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Ganhador: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

        }else{
            System.out.println("Luta não pode acontecer!");
        }
    }

    //------- Métodos Acessores ------//
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada(boolean b) {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
