public class Program {
    public static void main(String[] args) {
      int input = 479598;
      int modulos = 10;
      int result = 0;

      for (int i = 0 ; i < 6 ; i++){
        int del = input % modulos;
        input -= del;
        result += del / (modulos / 10);
        modulos *= 10;
      }
      System.out.println(result);
    }
  } 