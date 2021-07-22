package Exercicio01.Objeto_10;

public class Pendrive {
    //------------- Atributos -------------//
    float armazenamento;
    boolean personalizado;
    String tematica;
    String personagem;
    String usb;
    boolean tampado;
    float memoriaEmUso;
    //--------- Metodo Construtor ---------//

    public Pendrive() {
        this.setArmazenamento(32);
        this.setPersonalizado(true);
        this.setTematica("Geek");
        this.setPersonagem("DeadPool");
        this.setUsb("2.0");
        this.setTampado(true);
        this.setMemoriaEmUso(0);
        armazenaDados(0);
    }

    //----------------- Relatorio -------------------//
    public void relatorio(){
        System.out.println("");
        System.out.println("####################################");
        System.out.println("Armazenamento: " +  this.getArmazenamento());
        System.out.println("Personalizado: " +  this.isPersonalizado());
        System.out.println("Temática: " +       this.getTematica());
        System.out.println("Personagem: " +     this.getPersonagem());
        System.out.println("USB" +              this.getUsb());
        System.out.println("Memoria em uso:" +  this.getMemoriaEmUso());
        System.out.println("####################################");
        System.out.println("");
    }
    //------------- Metodos Especiais ---------------//
    public float armazenaDados(float dados){
        setArmazenamento(getArmazenamento() - dados);
        System.out.println(dados + " dados foram armazenados!");
        setMemoriaEmUso(getMemoriaEmUso() + dados);
        return dados;
    }
    public float transmiteDados(float dados){
        System.out.println(dados + " dados foram transmitidos!");
        return dados;
    }
    public float recebeDados(float dados){
        setArmazenamento(getArmazenamento() - dados);
        System.out.println(dados + " dados foram recebidos!");
        setMemoriaEmUso(getMemoriaEmUso() + dados);
        return dados;
    }
    public void aberto(){
        setTampado(false);
        System.out.println("O pendrive foi aberto");
    }
    public void tampado(){
        setTampado(true);
        System.out.println("O pendrive foi fechado");
    }
    public void conectado(){
        System.out.println("O pendrive foi Conectado.");
    }
    public void desconectado(){
        System.out.println("O pendrive foi Desconectado.");
    }


    //-------------- Metodos Acessores --------------//

    public float getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(float armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean isPersonalizado() {
        return personalizado;
    }
    public void setPersonalizado(boolean personalizado) {
        this.personalizado = personalizado;
    }

    public String getTematica() {
        return tematica;
    }
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getPersonagem() {
        return personagem;
    }
    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getUsb() {
        return usb;
    }
    public void setUsb(String usb) {
        this.usb = usb;
    }

    public boolean isTampado() {
        return tampado;
    }
    public void setTampado(boolean tampado) {
        this.tampado = tampado;
    }

    public float getMemoriaEmUso() {
        return memoriaEmUso;
    }
    public void setMemoriaEmUso(float memoriaEmUso) {
        this.memoriaEmUso = memoriaEmUso;
    }

}
