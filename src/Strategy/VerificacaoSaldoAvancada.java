package Strategy;

public class VerificacaoSaldoAvancada implements VerificacaoSaldo {
    @Override
    public boolean verificar(double saldo, double quantia) {
        // Implementação mais avançada
        return saldo >= quantia * 1.05; // Exemplo: taxa adicional
    }
}
