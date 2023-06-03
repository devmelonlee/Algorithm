import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ans = sc.nextLine().charAt(0);
    System.out.printf("%d\n", ans - 'A' + 65);
    
    sc.close();
  }
}