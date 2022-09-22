public class Administrador extends Gerenciaveis{
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 250;
    }
}
