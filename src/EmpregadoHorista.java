public class EmpregadoHorista extends Empregado {

    int totalHorasTrabalhadas;
    double valorDaHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, double valorDaHoraTrabalhada, int totalHorasTrabalhadas) {
        super(matricula, nome);
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
    }
    public double calcularSalario(){
        return totalHorasTrabalhadas * valorDaHoraTrabalhada;
    }
     @Override
    public String toString() {
        return "EmpregadoHorista{" +
                "totalDeHorasTrabalhadas=" + totalDeHorasTrabalhadas +
                ", valorDaHora=" + valorDaHora +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
