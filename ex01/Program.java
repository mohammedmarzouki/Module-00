
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a number : ");
      while (!sc.hasNextInt()){
        System.out.print("Enter a number : ");
        sc.next();
      }
      
      int num = sc.nextInt();
      sc.close();
      int comparaisons = 0;
      if (num < 2){
        // throw new Exception("IllegalArgument");
        System.err.println("IllegalArgument");
      }
      boolean isPrime = true;
      for (int i = 2; i <= num / 2; ++i) {
        comparaisons++;
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
      System.out.println(isPrime + " " + comparaisons);
    }
  } 