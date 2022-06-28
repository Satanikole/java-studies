public class CriaConta {
  public static void main(String[] args) {

    Cliente naruto = new Cliente();

    naruto.setNome("Naruto Uzumaki");
    naruto.setCpf("222.222.222-22");
    naruto.setProfissao("hokage");

    Conta contaNaruto = new Conta(1234, 776);
    contaNaruto.depositar(6666);
    contaNaruto.setTitular(naruto);
    System.out.println(contaNaruto.getTitular().getNome());
  }
}
