package Observer;

public class Cliente implements Observador {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(double saldo) {
        System.out.println("Cliente " + nome + " foi notificado. Novo saldo: " + saldo);
    }
}