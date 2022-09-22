public class SistemaInterno {
private String senha;
    public void autentica(Gerenciaveis ga) {
        boolean autenticou = ga.confirma(senha);
        if (autenticou){
            System.out.println("Pode entrar no sistema");
        }
        else {
            System.out.println("Erro de cadastro!");
        }
    }
}

