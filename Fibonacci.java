import javax.swing.JOptionPane;

public class Fibonacci {
  public static void main(String[] args) {
    // Solicita o número de termos usando uma caixa de diálogo
    String input = JOptionPane.showInputDialog("Digite o número de termos da série de Fibonacci:");
    int numTermos = Integer.parseInt(input);

    int primeiroTermo = 0;
    int segundoTermo = 1;

    StringBuilder resultado = new StringBuilder("Série de Fibonacci:\n");

    for (int i = 1; i <= numTermos; ++i) {
      resultado.append(primeiroTermo).append(" ");

      int proximoTermo = primeiroTermo + segundoTermo;
      primeiroTermo = segundoTermo;
      segundoTermo = proximoTermo;
    }

    // Exibe o resultado usando uma caixa de diálogo
    JOptionPane.showMessageDialog(null, resultado.toString(), "Série de Fibonacci", JOptionPane.INFORMATION_MESSAGE);
  }
}