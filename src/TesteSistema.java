public class TesteSistema {
    public static void main(String[] args) {
        Gerente marco = new Gerente();
        Administrador sandro = new Administrador();
        Cliente cliente = new Cliente();
        SistemaInterno si = new SistemaInterno();

        cliente.setSenha("Cadastro1");
        System.out.println(cliente.confirma("cadastro1"));

        marco.setSenha("SenhaPadrão");
        System.out.println(marco.confirma("SenhaPadrao"));

        sandro.setSenha("Bruto@#$");
        System.out.println(sandro.confirma("Bruto@#$"));

        si.autentica(marco);
        si.autentica(sandro);
        si.autentica(cliente);
    }

}

