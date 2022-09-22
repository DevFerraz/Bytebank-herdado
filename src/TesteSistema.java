public class TesteSistema {
    public static void main(String[] args) {
        Gerente marco = new Gerente();
        Administrador sandro = new Administrador();
        marco.setSenha("Traço");
        sandro.setSenha("Feijao");
        SistemaInterno si = new SistemaInterno();
        si.autentica(marco);
        si.autentica(sandro);
    }
}

