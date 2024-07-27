package ex1.Observer;

public class AgenciaXX implements Agencia {
private String nomAgencia;

public AgenciaXX(String nomAgencia) {
    this.nomAgencia = nomAgencia;
}
    @Override
    public void update(int valor) {
    System.out.println("L'agència " +nomAgencia + " ha canviat el seu valor a " +valor);

    }
}
