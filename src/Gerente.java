import java.util.Objects;

public class Gerente extends Gerenciaveis{
    private String senha;

    public double getBonificacao() {
        return super.getSalario() + super.getBonificacao();
    }

}