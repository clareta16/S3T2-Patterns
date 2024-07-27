package ex1.Observer;

import java.util.ArrayList;
import java.util.List;

public class Agent {
    private int valorBorsa;
    private List<Agencia> agencies = new ArrayList<>();

    public void afegirAgencia(Agencia agencia) {
        agencies.add(agencia);
    }

    public void eliminarAgencia(Agencia agencia) {
        agencies.remove(agencia);
    }

    public void canviarValorBorsa(int valorBorsa) {
        this.valorBorsa = valorBorsa;
        avisarAgencies();
    }

    public void avisarAgencies() {
        for (Agencia agencia : agencies) {
            agencia.update(valorBorsa);

        }
    }
}
