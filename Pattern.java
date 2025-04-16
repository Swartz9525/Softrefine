import java.util.*;
public class Pattern{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int number = sc.nextInt();
    for(int i=0; i<number; i++){
      int Alphabet = 65;
      for(int j=0; j<=i; j++){
        System.out.print((char) Alphabet++);
      }
      for(int j=0; j<=i; j++){
        System.out.print(j+1);
      }
      System.out.println();
    }
    sc.close();
  }
}