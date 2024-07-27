package ex2.Callback;

import ex2.Callback.models.MetodePagament;

public class BotigaSabates {
    private PassarellaPagament passarellaPagament;

    public BotigaSabates(PassarellaPagament passarellaPagament) {
        this.passarellaPagament = passarellaPagament;
    }

    public void comprarSabates(MetodePagament metodePagament, double preu) {
        passarellaPagament.processarPagament(metodePagament, preu);
        System.out.println("Has comprat les sabates per " + preu + " euros");
    }
}
