package Exercicio04;

public class Livro implements Publicacao {

    //------------- Atributos -------------//
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private String leitor;

    //-------------- Metodos --------------//
    public void detalhes(){
        System.out.println("#----------------------------------#");
        System.out.println("Titulo: " +     this.getTitulo());
        System.out.println("Autor: " +      this.getAutor());
        System.out.println("Paginas : " +   this.getTotPaginas());
        System.out.println("Abreto: " +     this.isAberto());
        System.out.println("Leitor: " +     this.getLeitor());
        System.out.println("#----------------------------------#");
    }

    //------------- Interface -------------//
    @Override
    public void abrir() {
        this.setAberto(true);
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void folhear(int p) {
        this.setPagAtual(p);
    }
    @Override
    public void avançarPag() {
        this.setPagAtual(getPagAtual() + 1);
    }
    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() - 1);
    }

    //--------- Metodo Construtor ---------//
    public Livro(String titulo, String autor, int totPaginas, String leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;

    }

    //--------- Metodos Acessores ---------//
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }
    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

}
