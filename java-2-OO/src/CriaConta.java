public class CriaConta {
  public static void main(String[] args) {

    Cliente naruto = new Cliente();
    naruto.nome = "Naruto Uzumaki";
    naruto.cpf = "111.111.111-11";
    naruto.profissao = "Hokage";

    Conta contaNaruto = new Conta();
    contaNaruto.depositar(6666);
    contaNaruto.titular = naruto;
    System.out.println(contaNaruto.titular.nome);
  }
}
