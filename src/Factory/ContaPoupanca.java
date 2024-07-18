package Factory;

public class ContaPoupanca extends Conta {
    @Override
    public void sacar(double quantia) {
        if (saldo >= quantia) {
            saldo -= quantia;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}