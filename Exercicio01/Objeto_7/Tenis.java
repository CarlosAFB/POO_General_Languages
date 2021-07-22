package Exercicio01.Objeto_7;

public class Tenis {
//------------- Atributos -------------//
    private String cor;
    private String modelo;
    private String marca;
    private int tamanho;
    private float valor;
    private String genero;
    private String usoIndicado;
    private String estadoDeConservacao;

//--------- Metodo Construtor ---------//
    public Tenis() {
        this.setCor("Preto e Branco");
        this.setModelo("Tênis Nike Revolution 5");
        this.setMarca("Nike");
        this.setTamanho(38);
        this.setValor(209.99f);
        this.setGenero("Feminino");
        this.setUsoIndicado("Esporte");
        this.setEstadoDeConservacao("Novo");
    }

//----------------- Relatorio -------------------//
public void relatorio(){
    System.out.println("");
    System.out.println("####################################");
    System.out.println("Cor do Tenis: " +   this.getCor());
    System.out.println("Marca: " +          this.getMarca());
    System.out.println("Tamanho: " +        this.getTamanho());
    System.out.println("Valor: " +          this.getValor());
    System.out.println("Gênero" +           this.getGenero());
    System.out.println("Uso indicado: " +          this.getUsoIndicado());
    System.out.println("Estado de Conservação: " + this.getEstadoDeConservacao());
    System.out.println("####################################");
    System.out.println("");
}
//-------------- Metodos Especiais --------------//
    public void amortecer(){

    }
    public void calcado(){
        System.out.println("O Tênis foi calçado.");
    }
    public void descalcado(){
        System.out.println("O Tênis foi descalçado.");
    }
    public void abrirCadarco(){
        System.out.println("O cadarço foi aberto.");
    }
    public void armarrarCadarco(){
        System.out.println("O cadarço foi amarrado.");
    }


//-------------- Metodos Acessores --------------//
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUsoIndicado() {
        return usoIndicado;
    }
    public void setUsoIndicado(String usoIndicado) {
        this.usoIndicado = usoIndicado;
    }

    public String getEstadoDeConservacao() {
        return estadoDeConservacao;
    }
    public void setEstadoDeConservacao(String estadoDeConservacao) {
        this.estadoDeConservacao = estadoDeConservacao;
    }

}
