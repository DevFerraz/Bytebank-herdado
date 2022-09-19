public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario patrick = new Funcionario();
        patrick.setNome("Patrick Silva");
        patrick.setCpf("012.345.678-90");
        patrick.setSalario(3297.60);
        System.out.println(patrick.getBonificacao());
        Funcionario sheila = new Funcionario();
        sheila.setNome("Sheila Assis");
        sheila.setCpf("123456789");
        sheila.setSalario(5342.50);
        System.out.println(sheila.getBonificacao());
    }
}
