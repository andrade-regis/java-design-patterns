import Command.DepositarComando;
import Command.ITAUMaquina;
import Command.SacarComando;
import Factory.Conta;
import Factory.ContaFactory;
import Observer.Cliente;
import Observer.ContaObservavel;
import Singleton.ITAU;

public class App {
    public static void main(String[] args) throws Exception {
        
        ITAU itau = ITAU.getInstance();
        
        Conta conta = ContaFactory.criarConta("corrente");
        
        Cliente cliente = new Cliente("João");
        ContaObservavel contaObservavel = new ContaObservavel();
        contaObservavel.adicionarObservador(cliente);
        
        ITAUMaquina itauMaquina = new ITAUMaquina();
        itauMaquina.setComando(new DepositarComando(contaObservavel, 1000));
        itauMaquina.executarComando();

        itauMaquina.setComando(new SacarComando(contaObservavel, 500));
        itauMaquina.executarComando();
    }
}
