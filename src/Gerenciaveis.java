import java.util.Objects;

public abstract interface Gerenciaveis {

    public abstract void setSenha(String senha);

    public abstract boolean confirma(String senha);
}