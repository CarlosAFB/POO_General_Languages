package Exercicio05.src.uecombate;

public class Lutador {

    //----------- Atributos ---------//
    private String  nome;
    private String  nacionalidade;
    private int     idade;
    private double altura;
    private double peso;
    private String  categoria;
    private int     vitorias;
    private int     derrotas;
    private int     empates;

    //------------ Métodos ----------//
    public void apresentar(){
        System.out.println("Lutador: "   +   this.getNome());
        System.out.println("Origem: "    +   this.getNacionalidade());
        System.out.println("Idade: "     +   this.getIdade());
        System.out.println("ALtura: "    +   this.getAltura());
        System.out.println("Peso: "      +   this.getPeso());
        System.out.println("Vitórioso: " +   this.getVitorias());
        System.out.println("Derrotado: " +   this.getDerrotas());
        System.out.println("Empatou: "   +   this.getEmpates());
    }
    public void status(){
        System.out.println("#---------------------------------------------------------------------#");
        System.out.print(this.getNome());
        System.out.print(" é um peso "+   this.getCategoria() + " e possui ");
        System.out.print(this.getVitorias() + " vitórias, ");
        System.out.print(this.getDerrotas() + " derrotas e ");
        System.out.println(this.getEmpates()  + " empates.");
        System.out.println("#---------------------------------------------------------------------#");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    //------- Método Construtor ------//
    public Lutador(String nome, String nacionalidade, int idade, double altura,
                   double peso, int vitorias, int derrotas, int empates){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setCategoria(getCategoria());
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    //------- Métodos Acessores ------//
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }

    public void setCategoria(String categoria) {
        if (this.getPeso() < 52.2){
            categoria = "Invalido";
        } else if (this.getPeso() <= 70.3){
            categoria = "Leve";
        } else if (this.getPeso() <= 83.9){
            categoria = "Médio";
        } else if (this.getPeso() <= 120.2){
            categoria = "Pesado";
        } else{
            categoria ="Inválido";
        }

        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getVitorias() {
        return vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public int getDerrotas() {
        return derrotas;
    }

}