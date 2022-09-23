import java.util.Objects;

public class Gerente extends Funcionario{
    private String senha;

    public double getBonificacao() {
        return super.getSalario() + super.getBonificacao();
    }

}