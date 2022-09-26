public class SistemaInterno {
    public void autentica(Gerenciaveis ga, String senha) {
        boolean autenticou = ga.confirma(senha);
        if (autenticou){
            System.out.println("Pode entrar no sistema");
        }
        else {
            System.out.println("Erro de cadastro!");
        }
    }
}

