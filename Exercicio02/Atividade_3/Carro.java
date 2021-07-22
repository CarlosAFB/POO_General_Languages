package Exercicio02.Atividade_3;

public class Carro {
//------------- Atributos -------------//
    private String modelo;
    private String cor;
    private Integer ano;
    private String marca;
    private String chassi;
    private String proprietario;
    private Integer velocidadeMaxima;
    private Integer velocidadeAtual;
    private Integer numeroDePortas;
    private Boolean tetoSolar;
    private Integer numeroDeMarchas;
    private Boolean cambioAutomatico;
    private Integer volumeDeCombustivel;
    private Integer autonomia;

//--------- Metodo Construtor ---------//
    public Carro(Integer numeroDeMarchas, Integer volumeDeCombustivel, Integer autonomia, Integer velocidadeMaxima) {
        this("", "", 0, "", "", "", velocidadeMaxima, 0, 0, false, numeroDeMarchas, false, volumeDeCombustivel, autonomia);
    }

    public Carro(String modelo, String cor, Integer ano, String marca, String chassi, String proprietario, Integer velocidadeMaxima, Integer velocidadeAtual, Integer numeroDePortas, Boolean tetoSolar, Integer numeroDeMarchas, Boolean cambioAutomatico, Integer volumeDeCombustivel, Integer autonomia) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setAno(ano);
        this.setMarca(marca);
        this.setChassi(chassi);
        this.setProprietario(proprietario);
        this.setVelocidadeMaxima(velocidadeMaxima);
        this.setVelocidadeAtual(velocidadeAtual);
        this.setNumeroDePortas(numeroDePortas);
        this.setTetoSolar(tetoSolar);
        this.setCambioAutomatico(cambioAutomatico);
        this.setNumeroDeMarchas(numeroDeMarchas);
        this.setVolumeDeCombustivel(volumeDeCombustivel);
        this.setAutonomia(autonomia);
    }

//-------------- Metodos Especiais --------------//
    public Integer acelerar(){
    if (this.velocidadeAtual < this.velocidadeMaxima)
        this.velocidadeAtual += 1;
    return this.velocidadeAtual;
}
    public Integer freiar(){
        this.velocidadeAtual = 0;
        return this.velocidadeAtual;
    }
    public void exibirVelocidadeAtual(){
        System.out.println("A velocidade atual do carro é "+this.velocidadeAtual+" km/h");
    }
    public void calcularCombustivelPorViagem(Integer km){
        if (km == null || km < 1)
            System.out.println("Não é possivel calcular a quantidade de combustível necessária para a quilometragem informada.");
        else{

            // Transformando Inteiro em Double
            Double quilometragem = Double.parseDouble(km.toString());
            Double autonomia = Double.parseDouble(this.autonomia.toString());

            //Calculando
            Double combustivel = quilometragem / autonomia;
            System.out.println("É necessário "+combustivel+" litros de combustível para percorrer "+km+" quilometros." );
        }
    }

//-------------- Relatório Estado ---------------//
    public void relatorio(){
        System.out.println("");
        System.out.println("####################################");
        System.out.println("Modelo: " +         this.getModelo());
        System.out.println("Cor: " +          this.getCor());
        System.out.println("ano: " +           this.getAno());
        System.out.println("Marca: " +     this.getMarca());
        System.out.println("Chassi: " +          this.getChassi());
        System.out.println("Proprietário: " +       this.getProprietario());
        System.out.println("Velocidade Máxima: " +       this.getVelocidadeMaxima());
        System.out.println("Velociade Atual: " +       this.getVelocidadeAtual());
        System.out.println("Número de Portas: " +          this.getNumeroDePortas());
        System.out.println("Teto Solar: " +  this.getTetoSolar());
        System.out.println("Numero de Marchas: " +  this.getNumeroDeMarchas());
        System.out.println("Câmbio Automático: " +  this.getCambioAutomatico());
        System.out.println("Volume de Combustivel: : " +  this.getVolumeDeCombustivel());
        System.out.println("Autonomia: " +  this.getAutonomia());
        System.out.println("####################################");
        System.out.println("");
    }

//--------- Metodos Acessores ---------//
    public void setNumeroDeMarchas(Integer numeroDeMarchas) {
        this.numeroDeMarchas = (numeroDeMarchas != null) ? numeroDeMarchas : 0;
        this.numeroDeMarchas = (this.numeroDeMarchas < 0) ? 0 : numeroDeMarchas;
    }

    public void setVolumeDeCombustivel(Integer volumeDeCombustivel) {
        this.volumeDeCombustivel = (volumeDeCombustivel != null) ? volumeDeCombustivel : 0;
        this.volumeDeCombustivel = (this.volumeDeCombustivel < 0) ? 0 : volumeDeCombustivel;
    }

    public void setAutonomia(Integer autonomia) {
        this.autonomia = (autonomia != null) ? autonomia : 0;
        this.autonomia = (this.autonomia < 0) ? 0 : autonomia;
    }

    public void setVelocidadeMaxima(Integer velocidadeMaxima) {
        this.velocidadeMaxima = (velocidadeMaxima != null) ? velocidadeMaxima : 1;
        this.velocidadeMaxima = (this.velocidadeMaxima < 1) ? 1 : velocidadeMaxima;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void setVelocidadeAtual(Integer velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public void setTetoSolar(Boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public void setCambioAutomatico(Boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public Integer getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getChassi() {
        return chassi;
    }

    public String getProprietario() {
        return proprietario;
    }

    public Integer getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public Integer getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public Boolean getTetoSolar() {
        return tetoSolar;
    }

    public Integer getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public Boolean getCambioAutomatico() {
        return cambioAutomatico;
    }

    public Integer getVolumeDeCombustivel() {
        return volumeDeCombustivel;
    }

    public Integer getAutonomia() {
        return autonomia;
    }

}