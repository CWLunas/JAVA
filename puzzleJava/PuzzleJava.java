import java.util.Random;

public class PuzzleJava {
  
  public static int[] getTenRolls() {
    int[] rolls = new int[10];
    Random random = new Random();
    
    for (int i = 0; i < 10; i++) {
      rolls[i] = random.nextInt(20) + 1;
    }
    
    return rolls;
  }
  
  public static char getRandomLetter() {
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    Random random = new Random();
    int index = random.nextInt(26);
    
    return alphabet[index];
  }
  
  public static String generatePassword() {
    StringBuilder password = new StringBuilder();
    
    for (int i = 0; i < 8; i++) {
      password.append(getRandomLetter());
    }
    
    return password.toString();
  }
  
  public static String[] getNewPasswordSet(int length) {
    String[] passwordSet = new String[length];
    
    for (int i = 0; i < length; i++) {
      passwordSet[i] = generatePassword();
    }
    
    return passwordSet;
  }
}