package Command;

public class ITAUMaquina {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void executarComando() {
        comando.executar();
    }
}
