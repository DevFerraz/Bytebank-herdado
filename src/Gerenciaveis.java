import java.util.Objects;

public abstract class Gerenciaveis extends Funcionario {
    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public boolean confirma(String senha) {
        return this.senha.equals(senha);
    }
}