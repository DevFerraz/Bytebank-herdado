import java.util.Objects;

public class Cliente implements Gerenciaveis {

    private String senha = "";

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean confirma(String senha) {
        return this.senha.equals(senha);
    }
}

