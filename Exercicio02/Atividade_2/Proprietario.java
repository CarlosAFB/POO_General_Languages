package Exercicio02.Atividade_2;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.lang.Math.toIntExact;

public class Proprietario {
//------------- Atributos -------------//
    private String Nome;
    private long CPF;
    private long RG;
    private int Telefone;
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private int Cep;
    private String Complemento;

//--------- Metodo Construtor ---------//
    public Proprietario(String nome, long CPF, long RG) {
        setNome(nome);
        setCPF(CPF);
        setRG(RG);
    }

//-------------- Metodos Especiais --------------//
    public void vericadorCPF(){

        int[] vcpf = new int[11];
        long cpf = getCPF();
        long num=10000000000L;
        long resto;
        int j;
        int i;
        int dig1=0;
        int dig2=0;

        //guarda cpf digitado em um vetor
        for (j=0;j<11;j++){
            resto= (cpf % num);
            i= toIntExact(cpf / num);
            num=num/10;
            cpf=resto;
            vcpf[j]=i;
        }

        //soma primeiro digito
        i=10;
        for (j=0;j<9;j++){
            dig1=dig1+(vcpf[j]*i);
            i=i-1;
        }

        //soma segundo digito
        i=11;
        for (j=0;j<10;j++){
            dig2=dig2+(vcpf[j]*i);
            i=i-1;
        }

        //calcula digito verificador 1 e 2
        dig1= dig1*10 %11;
        dig2= dig2*10 %11;
        //caso resultado seja 10 mudar para 0
        if (dig1==10) dig1=0;
        if (dig2==10) dig2=0;
        //verifica se o digito verificador 1 e 2 obtidos são iguais aos digitos verificadores do cpf digitado
        if (dig1==vcpf[9] && (dig2==vcpf[10]))System.out.println("CPF Válido");
        else System.out.println("CPF inválido");
        setCPF(0);
}


    public void calculaidade(int d, int m, int a){
        Calendar cal = GregorianCalendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        int mesAtual = cal.get(Calendar.MONTH);
        int diaAtual = cal.get (Calendar.DAY_OF_MONTH);


        int diaNasc = d;
        int mesNasc = m;
        int anoNasc = a;
        int idade = (anoAtual - anoNasc);
        System.out.println("voce tem: " + idade + " anos.");

}

//----------------- Relatorio -------------------//
    public void relatorio(){
        System.out.println("");
        System.out.println("####################################");
        System.out.println("Nome: " +         this.getNome());
        System.out.println("Cpf: " +          this.getCPF());
        System.out.println("RG: " +           this.getRG());
        System.out.println("Telefone: " +     this.getTelefone());
        System.out.println("Rua: " +          this.getRua());
        System.out.println("Bairro: " +       this.getBairro());
        System.out.println("Cidade: " +       this.getCidade());
        System.out.println("Estado: " +       this.getEstado());
        System.out.println("CEP: " +          this.getCep());
        System.out.println("Complemento: " +  this.getComplemento());
        System.out.println("####################################");
        System.out.println("");
    }

//--------- Metodos Acessores ---------//
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    public long getCPF() {
        return CPF;
    }
    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public long getRG() {
        return RG;
    }
    public void setRG(long RG) {
        this.RG = RG;
    }

    public int getTelefone() {
        return Telefone;
    }
    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public String getRua() {
        return Rua;
    }
    public void setRua(String rua) {
        Rua = rua;
    }

    public String getBairro() {
        return Bairro;
    }
    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }

    public int getCep() {
        return Cep;
    }
    public void setCep(int cep) {
        Cep = cep;
    }

    public String getComplemento() {
        return Complemento;
    }
    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

}
