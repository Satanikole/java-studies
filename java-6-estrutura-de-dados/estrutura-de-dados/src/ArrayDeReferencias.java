public class ArrayDeReferencias {
    public static void main(String[] args) {
        
      ContaCorrente[] contasCorrentes = new ContaCorrente[5];
      // array que guarda as referencias para as contas, não criou nenhuma conta.

      ContaCorrente cc1 = new ContaCorrente(666, 1234);

      contasCorrentes[0] = cc1;
      

    }
}
