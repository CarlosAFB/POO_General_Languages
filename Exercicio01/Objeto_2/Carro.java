package Exercicio01.Objeto_2;

public class Carro {

//------------- Atributos -------------//
    private String  cor;
    private String  estadoDeUso;
    private String  nPlaca;
    private int     nPortas;
    private int     nPassageiros;
    private float   quilometragem;
    private boolean motorista;
    private boolean portasOnOff;
    private boolean carMov;

//--------- Metodo Construtor ---------//
    public Carro() {
        this.setCor("Branco");
        this.setEstadoDeUso("Novo");
        this.setnPlaca("AA000");
        this.setnPortas(4);
        this.setnPassageiros(4);
        this.setQuilometragem(0);
    }

//----------------- Relatorio -------------------//
    public void relatorio(){
        System.out.println("");
        System.out.println("####################################");
        System.out.println("Cor do carro: " + this.getCor());
        System.out.println("Estado de uso: " + this.getEstadoDeUso());
        System.out.println("Numero da Placa: " + this.getnPlaca());
        System.out.println("Numero de Portas: " + this.getnPortas());
        System.out.println("Numero de Passageiros :" + this.getnPassageiros());
        System.out.println("Quilometragem: " + this.getQuilometragem());
        System.out.println("####################################");
        System.out.println("");
    }

//-------------- Metodos Especiais --------------//
    public void abrirPortas(){
        this.portasOnOff = true;
        System.out.println("Portas Abertas!");

    }

    public void fecharPortas(){
        this.portasOnOff = false;
        System.out.println("Portas Fechadas!");
    }

    public void entrarMotoristas(){
        if(this.portasOnOff == true){
            System.out.println("O motorista entrou no carro!");
        }
    }

    public void sairMotoristas(){
        if(this.portasOnOff == true)
            System.out.println("O motorista saiu do carro!");
        else
            System.out.println("Impossivel sair do carro com portas fechadas!");

    }

    public void ligar() {
        if (this.motorista == true)
            System.out.println("O carro foi ligado!");
        else
            System.out.println("Não é possivel ligar o Carro sem o motorista!");
    }

    public void desligar(){
        if(this.motorista == true){
            System.out.println("O carro foi desligado!");
        }else
            System.out.println("Não é possivel desligar o Carro sem o motorista!");
    }

    public void movimentar(){
        if(this.motorista == true && this.portasOnOff == false){
            System.out.println("O carro está em movimento!");
            this.carMov = true;
        }else if(this.motorista == true && this.portasOnOff == true){
            System.out.println("O carro não pode se movimentar com as portas abertas!");
            this.carMov = false;
        }else{
            System.out.println("Para movimentar o carro é necessario que haja um motorista e que as portas estejam fechadas!");
            this.carMov = false;
        }

    }

    public void parar(){
        if(carMov == true){
            System.out.println("O carro foi parado!");
            carMov = false;
        }else{
            System.out.println("O carro já esta parado!");
        }
    }

    public void virarDireita(){
        if(this.motorista == true && this.carMov == true){
            System.out.println("Virando a Direita!");
        }
        else if(this.motorista == true && this.carMov == false){
            System.out.println("Virando a Direita, porem o carro não está em movimento!");
        }
    }

    public void virarEsquerda() {
        if (this.motorista == true) {
            System.out.println("Virando a Esquerda");
        }
    }

//--------- Metodos Acessores ---------//
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEstadoDeUso() {
        return estadoDeUso;
    }
    public void setEstadoDeUso(String estadoDeUso) {
        this.estadoDeUso = estadoDeUso;
    }

    public int getnPortas() {
        return nPortas;
    }
    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    public int getnPassageiros() {
        return nPassageiros;
    }
    public void setnPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
    }

    public String getnPlaca() {
        return nPlaca;
    }
    public void setnPlaca(String nPlaca) {
        this.nPlaca = nPlaca;
    }

    public float getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isMotorista() {
        return motorista;
    }
    public void setMotorista(boolean motorista) {
        this.motorista = motorista;
    }

    public boolean isPortasOnOff() {
        return portasOnOff;
    }
    public void setPortasOnOff(boolean portasOnOff) {
        this.portasOnOff = portasOnOff;
    }

    public boolean isCarMov() {
        return carMov;
    }
    public void setCarMov(boolean carMov) {
        this.carMov = carMov;
    }

}