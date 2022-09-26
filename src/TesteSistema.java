public class TesteSistema {
    public static void main(String[] args) {
        Gerente marco = new Gerente();
        Administrador sandro = new Administrador();
        Cliente cliente = new Cliente();
        SistemaInterno si = new SistemaInterno();

        cliente.setSenha("Cadastro1");

        marco.setSenha("SenhaPadrão");

        sandro.setSenha("Bruto@#$");

        si.autentica(marco, "SenhaPadrão");
        si.autentica(sandro, "Bruto@#$");
        si.autentica(cliente, "Cadastro1");
    }

}

