package Factory;

public abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    public abstract void sacar(double quantia);
}







