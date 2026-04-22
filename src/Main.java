

public class Main {
    public static void main(String[] args) {
        Empregado[] empregado= new Empregado[4];

        empregado[0]= new EmpregadoComissionado(1, "GiovanniComissionado", 2000, 20000);
        empregado[1]= new EmpregadoHorista(2, "GiovanniHorista", 160, 100);
        empregado[2]= new EmpregadoComissionado(3, "GiovanniComissionado2", 100, 40000);
        empregado[3]= new EmpregadoHorista(4, "GiovanniHorista2", 10, 250);


        for (Empregado e  : empregado){
            System.out.println("---------------------------------------------");
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
            System.out.println("---------------------------------------------");
            System.out.println();
        }


    }
}
