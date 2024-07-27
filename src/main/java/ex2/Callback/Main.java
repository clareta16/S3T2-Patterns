package ex2.Callback;

import ex2.Callback.models.CompteBancari;
import ex2.Callback.models.MetodePagament;
import ex2.Callback.models.PayPal;
import ex2.Callback.models.Targeta;

public class Main {
    public static void main(String[] args) {

        PassarellaPagament passarellaPagament = new PassarellaPagament();

        BotigaSabates Merkalzados = new BotigaSabates(passarellaPagament);


        MetodePagament compte = new CompteBancari();
        Merkalzados.comprarSabates(compte, 200.99);


        MetodePagament black = new Targeta();
        Merkalzados.comprarSabates(black, 120.06);

        MetodePagament payPal = new PayPal();
        Merkalzados.comprarSabates(payPal, 50.00);



    }

}
