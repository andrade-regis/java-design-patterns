package Factory;

public class ContaFactory {
    public static Conta criarConta(String tipo) {
        if (tipo.equalsIgnoreCase("corrente")) {
            return new ContaCorrente();
        } else if (tipo.equalsIgnoreCase("poupanca")) {
            return new ContaPoupanca();
        }
        return null;
    }
}
