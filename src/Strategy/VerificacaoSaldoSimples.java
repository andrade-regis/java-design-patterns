package Strategy;

public class VerificacaoSaldoSimples implements VerificacaoSaldo {
    @Override
    public boolean verificar(double saldo, double quantia) {
        return saldo >= quantia;
    }
}
