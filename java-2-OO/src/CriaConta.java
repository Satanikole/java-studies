public class CriaConta {
  public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 20.10; 
    System.out.println(primeiraConta.saldo);

    Conta segundaConta = new Conta();
    segundaConta.saldo = 80;
    System.out.println(segundaConta.titular);
  }
}
