class Conta {
  private double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  private static int totalDeContas;

  public Conta(int agencia, int numero) {
    this.agencia = agencia;
    this.numero = numero;
    totalDeContas +=1;
    System.out.printf("O total de contas é %d", totalDeContas);

  }
  
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

  // public void setNumero(int num) {
  //   if(num <= 0) {
  //     System.out.println("Proibido valores menores do que 1");
  //     return; 
  //   }
  //     numero = num;
  // }

  public int getAgencia() {
    return agencia;
  }

  // public void setAgencia(int agen) {
  //   if(agen <= 0) {
  //     System.out.println("Proibido valores menores do que 1");
  //     return; 
  //   }
  //   agencia = agen;
  // }

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public static int getTotalContas() {
    return Conta.totalDeContas;
  }

}
