import java.util.Objects;

public class Gerente extends Funcionario implements Gerenciaveis{
    private String senha = "";

    public double getBonificacao() {
        return super.getSalario() + super.getBonificacao();
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean confirma(String senha) {
        return this.senha.equals(senha);
    }
}