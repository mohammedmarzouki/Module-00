public class Program {
    public static void main(String[] args) {
      int input = 479598;
      int modulos = 10;
      int result = 0;

      int del = input % modulos;
      input /= modulos;
      result += del;

      del = input % modulos;
      input /= modulos;
      result += del;

      del = input % modulos;
      input /= modulos;
      result += del;

      del = input % modulos;
      input /= modulos;
      result += del;

      del = input % modulos;
      input /= modulos;
      result += del;

      del = input % modulos;
      result += del;

      System.out.println(result);
    }
  } 