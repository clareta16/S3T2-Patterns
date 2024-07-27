package ex2.Callback.models;

public class PayPal implements MetodePagament {

    @Override
    public void pagar(double preu) {
        System.out.println("S'ha realitzat la compra de " + preu + " euros a Merkalzados");

    }
}
