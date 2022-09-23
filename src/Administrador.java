public class Administrador extends Funcionario{
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 250;
    }
}
