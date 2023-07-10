import java.util.Random;

public class TestMain {
  public static void main(String[] args) {
    int[] rolls = PuzzleJava.getTenRolls();
    System.out.println("Ten rolls:");
    for (int roll : rolls) {
      System.out.print(roll + " ");
    }
    System.out.println();
    
    char randomLetter = PuzzleJava.getRandomLetter();
    System.out.println("Random letter: " + randomLetter);
    
    String password = PuzzleJava.generatePassword();
    System.out.println("Generated password: " + password);
    
    int passwordSetLength = 5;
    String[] passwordSet = PuzzleJava.getNewPasswordSet(passwordSetLength);
    System.out.println("Password set:");
    for (String pwd : passwordSet) {
      System.out.println(pwd);
    }
    
    shufflePasswordSet(passwordSet);
    
    System.out.println("Shuffled password set:");
    for (String pwd : passwordSet) {
      System.out.println(pwd);
    }
  }
  
  public static void shufflePasswordSet(String[] passwordSet) {
    Random random = new Random();
    
    for (int i = passwordSet.length - 1; i > 0; i--) {
      int j = random.nextInt(i + 1);
      
      // Swap the elements at positions i and j
      String temp = passwordSet[i];
      passwordSet[i] = passwordSet[j];
      passwordSet[j] = temp;
    }
  }
}