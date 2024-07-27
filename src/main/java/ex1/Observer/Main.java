package ex1.Observer;

public class Main {
    public static void main(String[] args) {
        Agent agent1 = new Agent();

        Agencia agenciaA = new AgenciaXX("Wall Street");
        Agencia agenciaB = new AgenciaXX("Strall Weet");

        agent1.afegirAgencia(agenciaA);
        agent1.afegirAgencia(agenciaB);

        agent1.canviarValorBorsa(10);

    }
}
