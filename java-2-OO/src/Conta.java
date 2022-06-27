class Conta {
  private double saldo;
  private int agencia;
  private int numero;
  Cliente titular;
  
  public void depositar(double valor ) {
    saldo += valor;
  }

  public boolean saca(double valor) {
     if(saldo >= valor) {
      saldo -= valor;
      return true;
     } else {
      return false;
     }
  }

  public boolean transfere(double valor, Conta destino ) {
     if(saldo >= valor) {
       saca(valor);
       destino.depositar(valor);
       return true;
     } else {
      return false;
     }
  }

  public double getSaldo() {
    return saldo;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int num) {
      numero = num;
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agen) {
    agencia = agen;
  }
}
