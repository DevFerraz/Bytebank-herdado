public class TesteSistema {
    public static void main(String[] args) {
        Gerente marco = new Gerente();
        Administrador sandro = new Administrador();

        Cliente cliente = new Cliente();

        cliente.setSenha("MeuOvo");

        boolean erro = cliente.confirma("meuEgg");
        boolean acerto = cliente.confirma("MeuOvo");

        System.out.println(erro);
        System.out.println(acerto);

       /* marco.setSenha("Traço");
        sandro.setSenha("Feijao");
        SistemaInterno si = new SistemaInterno();
        si.autentica(marco);
        si.autentica(sandro);*/
    }

}

