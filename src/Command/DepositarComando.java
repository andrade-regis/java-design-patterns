package Command;

import Factory.*;

public class DepositarComando implements Comando {
    private Conta conta;
    private double quantia;

    public DepositarComando(Conta conta, double quantia) {
        this.conta = conta;
        this.quantia = quantia;
    }

    @Override
    public void executar() {
        conta.depositar(quantia);
    }
}
