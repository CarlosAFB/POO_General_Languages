package Exercicio01.Objeto_8;

public class Professor {
//------------- Atributos -------------//
    private String nome;
    private String especialidade;
    private String funcao;
    private String formacao;
    private int    idade;
    private String genero;
    private boolean trabalhando;

//--------- Metodo Construtor ---------//

    public Professor() {
        this.setNome("Daniel");
        this.setEspecialidade("Estatística");
        this.setFuncao("Professor");
        this.setFormacao("Doutorado");
        this.setIdade(45);
        this.setGenero("Masculino");
        this.setTrabalhando(false);
    }

//----------------- Relatorio -------------------//
    public void relatorio(){
        System.out.println("");
        System.out.println("####################################");
        System.out.println("Nome: " +           this.getNome());
        System.out.println("especialidade: " +  this.getEspecialidade());
        System.out.println("Função: " +         this.getFuncao());
        System.out.println("Formação: " +       this.getFormacao());
        System.out.println("Idade" +            this.getIdade());
        System.out.println("Gênero" +           this.getGenero());
        System.out.println("####################################");
        System.out.println("");
    }
//------------- Metodos Especiais ---------------//
    public void ensinar(){
        System.out.println("O professo está ensinando.");
    }
    public void avaliar(){
        System.out.println("O professo está avaliando.");
    }
    public void genrenciapessoas(){
        System.out.println("O professo está administrando a turma.");
    }
    public void trabalhar(){
        setTrabalhando(true);
        System.out.println("O professo está trabalhando.");
    }



//-------------- Metodos Acessores --------------//
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
