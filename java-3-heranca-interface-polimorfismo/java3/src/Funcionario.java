public class Funcionario {

 private String nome;
 private String cpf;
 protected static double salario;
 private static int cargo = 0;

 public double getBonificacao() {
    return Funcionario.salario * 0.1;
  }

 public int getCargo() {
   return cargo;
 }

 public void setCargo(int cargo) {
   Funcionario.cargo = cargo;
 }

public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getCpf() {
    return cpf;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}
public double getSalario() {
    return salario;
}
public void setSalario(double salario) {
    Funcionario.salario = salario;
} 

 
}
