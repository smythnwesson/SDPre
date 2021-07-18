import java.util.Scanner;
public class Objective4Lab3 {
  public static void main (String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();
    currentYear = 2021;
    birthYear = age - currentYear;



    System.out.println("you were born in " + birthYear);
    input.close();
  }
}
