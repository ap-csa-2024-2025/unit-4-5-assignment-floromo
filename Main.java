import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // Problem 1
    System.out.println("Give a string: ");
    String word = sc.nextLine();
    System.out.println("Give an int: ");
    int N = sc.nextInt();
    sc.nextLine();
    printNTimes(word, N);
    System.out.println();

    // Problem 2
    printNums();

    // Problem 3
    System.out.println("Give an int: ");
    N = sc.nextInt();
    uprightNumberTriangle(N);

    // Problem 4
    starTree();

    // Problem 5
    multTable();
  }

  // Problem 1
  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++) {
      for (int j = 0; j < N; j++) {
        String letter = word.substring(i, i+1);
        System.out.print(letter);
      }
    }
  }

  // Problem 2
  public static void printNums()
  {
    for (int i = 10; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  // Problem 3
  public static void uprightNumberTriangle(int N)
  {
    for (int i = 1; i <= N; i++){
      for (int j = 1; j <= i; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  // Problem 4
  public static void starTree()
  {
    for (int row = 1; row <= 9; row++){
      for (int space = 0; space < row; space++){
        System.out.print(" ");
      }
      for (int num = 9; num > row; num--){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  // Problem 5
  public static void multTable()
  {
    for(int row = 1; row <= 10; row++){
      for(int col = 1; col <= 10; col++){
        System.out.print(col*row + " ");
      }
      System.out.println();
    }
  }
}
