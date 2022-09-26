public class Administrador extends Funcionario implements Gerenciaveis{
    private String senha = "";
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + 250;
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
