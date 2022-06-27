class Conta {
  double saldo;
  int agencia;
  int numero;
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
}
