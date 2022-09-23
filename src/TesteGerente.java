public class TesteGerente {
    public static void main(String[] args) {
        Gerente katia = new Gerente();
        katia.setCpf("496.841.968-06");
       /* katia.setSenha("GerenteKatia");*/
        katia.setNome("Katia Andrade");
        katia.setSalario(6350);
        System.out.println(katia.getBonificacao());
    }
}
