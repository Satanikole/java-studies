public class Bonificacao {
  private double soma; 

  public void registraFuncionario(Funcionario func) {
    double boni = func.getBonificacao();
    this.soma = this.soma + boni; 
  }

  public double getSoma() {
    return soma;
  }
}
