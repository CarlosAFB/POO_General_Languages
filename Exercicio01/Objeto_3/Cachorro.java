package Exercicio01.Objeto_3;

public class Cachorro {

//------------- Atributos -------------//
    private String cor;
    private String estadoLimpeza;
    private String corOlhos;
    private float altura;
    private float comprimento;
    private boolean hasColeira;
    private boolean dormir;

//--------- Metodo Construtor ---------//
    public Cachorro() {
        this.cor = "Caramelo";
        this.estadoLimpeza = "Limpo";
        this.corOlhos = "Escuros";
        this.altura = 0;
        this.comprimento = 0;
        this.hasColeira = false;
    }

//----------------- Relatorio -------------------//
public void relatorio(){
    System.out.println("");
    System.out.println("####################################");
    System.out.println("Cor do cachorro: " + this.getCor());
    System.out.println("Estado de limpeza: " + this.getEstadoLimpeza());
    System.out.println("Cor do olhos: " + this.getCorOlhos());
    System.out.println("Altura: " + this.getAltura());
    System.out.println("Comprimento" + this.getComprimento());
    System.out.println("hasColeira: " + this.isHasColeira());
    System.out.println("####################################");
    System.out.println("");
    }

//-------------- Metodos Especiais --------------//
    public void dorme(){
        setDormir(true);
        System.out.println("Cochorro está dormindo.");

    }
    public void acorda(){
        setDormir(false);
        System.out.println("Cochorro está acordado.");
    }
    public void brincar(){
        if (isDormir())
            System.out.println("O cachorro não pode brincar, pois ainda está dormindo.");
        else
            System.out.println("O cachorro está brincando!");
    }
    public void beber(){
        if (isDormir())
            System.out.println("O cachorro não pode beber, pois ainda está dormindo.");
        else
            System.out.println("O cachorro está bebendo água.");
    }
    public void balancaRabo(){
        if (isDormir())
            System.out.println("O cachorro não pode balamçar o rabo, pois ainda está dormindo.");
        else
            System.out.println("O cachorro está balanççando o rabo.");
    }
    public void pula(){
        if (isDormir())
            System.out.println("O cachorro não pode pular, pois ainda está dormindo.");
        else
            System.out.println("O cachorro está pulando");}
    public void movimentar(){
        if (isDormir())
            System.out.println("O cachorro não pode se movimentar, pois ainda está dormindo.");
        else
            System.out.println("O cachorro está se movimentando");}
    public void morder(){
        if (isDormir())
            System.out.println("O cachorro não pode se morder, pois ainda está dormindo.");
        else
            System.out.println("O cachorro está se movimentando");
    }
    public void late(){
        if (isDormir())
            System.out.println("O cachorro não pode se latir, pois ainda esta dormindo.");
        else
            System.out.println("O cachorro está se latindo");
    }

//-------------- Metodos Acessores --------------//
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }

    public void setEstadoLimpeza(String estadoLimpeza) {
        this.estadoLimpeza = estadoLimpeza;
    }
    public String getEstadoLimpeza() {
        return estadoLimpeza;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }
    public String getCorOlhos() {
        return corOlhos;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    public float getComprimento() {
        return comprimento;
    }

    public void setHasColeira(boolean hasColeira) {
        this.hasColeira = hasColeira;
    }
    public boolean isHasColeira() {
        return hasColeira;
    }

    public void setDormir(boolean dormir) {
        this.dormir = dormir;
    }
    public boolean isDormir() {
        return dormir;
    }

}
