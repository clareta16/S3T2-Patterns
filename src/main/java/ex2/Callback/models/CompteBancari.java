package ex2.Callback.models;

public class CompteBancari implements MetodePagament {
    @Override
    public void pagar(double preu) {
        System.out.println("S'ha realitzat la compra de " + preu + " euros a Merkalzados");
    }
}
