package Exercicio01.Objeto_6;

public class Caneta {
//------------- Atributos -------------//
    private String  cor;
    private String  marca;
    private float   carga;
    private float   ponta;
    private boolean tampada;

//--------- Metodo Construtor ---------//
    public Caneta() {
        this.setCor("Azul");
        this.setMarca("BIC");
        this.setCarga(100f);
        this.setPonta(0.7f);
        this.setTampada(true);
    }

//----------------- Relatorio -------------------//
    public void relatorio(){
        System.out.println("");
        System.out.println("####################################");
        System.out.println("Cor dacaneta: " +   this.getCor());
        System.out.println("Marca: " +          this.getMarca());
        System.out.println("Carga: " +          this.getCarga());
        System.out.println("Ponta: " +          this.getPonta());
        System.out.println("Tampada" +          this.isTampada());
        System.out.println("####################################");
        System.out.println("");
    }

//----------------- Metodos Especiais -------------------//
    public void rabiscar(){
        if(isTampada())
            System.out.println("A caneta não pode rabiscar enquanto estiver tampada!");
        else
            System.out.println("A caneta está rabiscando...");
    }
    public void tampar(){
        if(isTampada())
            System.out.println("A caneta já esta tampada!");
        else
            setTampada(true);
            System.out.println("A caneta foi tampada!");
    }
    public void destampar(){
    if(isTampada() == false)
        System.out.println("A caneta já esta destampada!");
    else
        setTampada(false);
        System.out.println("A caneta foi destampada!");
    }

//-------------- Metodos Acessores --------------//
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }
    public float getCarga() {
        return carga;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public float getPonta() {
        return ponta;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public boolean isTampada() {
        return tampada;
    }

}
