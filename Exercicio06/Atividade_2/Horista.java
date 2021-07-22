package Exercicio06.Atividade_2;

public class Horista extends Funcionario implements IPagar{
//------------------- Atributos -------------------//
    private double valorDaHoraTrabalhada;
    private int totalEmHorasTrabalhadas;

//---------------- Metodo Construtor --------------//
    public Horista(String nome, String cargo, double valorDaHoraTrabalhada, int totalEmHorasTrabalhadas) {
        super.setNome(nome);
        super.setCargo(cargo);
        this.setValorDaHoraTrabalhada(valorDaHoraTrabalhada);
        this.setTotalEmHorasTrabalhadas(totalEmHorasTrabalhadas);
    }

//--------------- Metodos Abstratos ---------------//
    @Override
    public double calcularTotalAPagar() {
    return getValorDaHoraTrabalhada() * getTotalEmHorasTrabalhadas();
    }

//--------------- Metodos Especias ---------------//
    public void Status(){
        System.out.println("O funcionário " +getNome()+ " com cargo " +getCargo()+ " deverá receber R$" +calcularTotalAPagar()+".");
    }


//--------------- Metodos Acessores ---------------//
    public double getValorDaHoraTrabalhada() {
        return valorDaHoraTrabalhada;
    }
    public void setValorDaHoraTrabalhada(double valorDaHoraTrabalhada) {
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    public int getTotalEmHorasTrabalhadas() {
        return totalEmHorasTrabalhadas;
    }
    public void setTotalEmHorasTrabalhadas(int totalEmHorasTrabalhadas) {
        this.totalEmHorasTrabalhadas = totalEmHorasTrabalhadas;
    }

}
