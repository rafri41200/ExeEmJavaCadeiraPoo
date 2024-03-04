public class Fatorial {
  public static void main(String[] args) {

    for (int i = 10; i > 0; i--) {
      int fatorial = 1;
      for (int n = i; n > 0; n--) {
        fatorial = fatorial * n;

      }
      System.out.println("o fatorial de " + i + " é : " + fatorial);

    }

  }
}
