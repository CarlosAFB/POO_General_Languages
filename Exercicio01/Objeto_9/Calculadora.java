package Exercicio01.Objeto_9;

public class Calculadora {
//------------- Atributos -------------//
    private String  cor;
    private String  tipo;
    private String  tamanho;
    private boolean ligada;


//--------- Metodo Construtor ---------//
    public Calculadora() {
        this.setCor("Azul");
        this.setTipo("Comum");
        this.setTamanho("Pequena");
        this.setLigada(false);
    }

//------------- Metodos Especiais ---------------//
    public int recebeValor(int a){
        int valor = a;
        return valor;
    }
    public int soma(int a,int b){
        int total;
        if(isLigada()) {
            total = a + b;
        }else{
            System.out.println("Calculadora desligada!");
            total = 0;
        }

        return total;
    }
    public int subtrai(int a,int b){
        int total;
        if(isLigada()) {
            total = a - b;
        }else{
            System.out.println("Calculadora desligada!");
            total = 0;
        }

        return total;
    }
    public int multiplica(int a,int b){
        int total;
        if(isLigada()) {
            total = a * b;
        }else{
            System.out.println("Calculadora desligada!");
            total = 0;
        }

        return total;
    }
    public float divide(float a,float b){
        float total;
        if(isLigada()) {
            total = a / b;
        }else{
            System.out.println("Calculadora desligada!");
            total = 0;
        }

        return total;
    }
    public float devolveValor(float a){
        return a;
    }
    public void ligada(){
        this.setLigada(true);
        System.out.println("A calculadora foi ligada");
    }
    public void desligada(){
        this.setLigada(false);
        System.out.println("A calculadora foi desligada");
    }

//-------------- Metodos Acessores --------------//
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

}
