package Command;

import Factory.*;

public class SacarComando implements Comando {
    private Conta conta;
    private double quantia;

    public SacarComando(Conta conta, double quantia) {
        this.conta = conta;
        this.quantia = quantia;
    }

    @Override
    public void executar() {
        conta.sacar(quantia);
    }
}
