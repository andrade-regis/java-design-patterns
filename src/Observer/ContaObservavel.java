package Observer;

import Factory.*;

import java.util.ArrayList;
import java.util.List;

public class ContaObservavel extends Conta {
    private List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void sacar(double quantia) {
        if (saldo >= quantia) {
            saldo -= quantia;
            notificarObservadores();
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(saldo);
        }
    }
}
