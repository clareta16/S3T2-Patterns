package ex2.Callback;

import ex2.Callback.models.MetodePagament;

public class PassarellaPagament {
    public void processarPagament(MetodePagament metodepagament, double preu) {
        metodepagament.pagar(preu);
    }

}
