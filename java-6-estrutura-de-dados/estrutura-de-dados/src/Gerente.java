public class Gerente implements Autenticavel {
  
  private Autenticador autentica;

  public Gerente() {
    this.autentica = new Autenticador();
  }

  public void setSenha(int senha) {
    this.autentica.setSenha(senha);
  }

  public double getBonificacao() {
    return Funcionario.salario;
  }

  @Override
  public boolean autentica(int senha) {
     boolean autenticou = this.autentica.autentica(senha);
     return autenticou;
}

}
