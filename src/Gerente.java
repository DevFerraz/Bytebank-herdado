import java.util.Objects;

public class Gerente extends Funcionario{
    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public boolean confirma(String senha) {
        return Objects.equals(this.senha, senha);
    }

    public double getBonificacao() {
        return this.getSalario();
    }

}