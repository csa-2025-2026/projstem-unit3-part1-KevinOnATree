import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input width and length of rectangle 1: ");
    double wid = sc.nextDouble();
    double len = sc.nextDouble();
    System.out.println("\nInput width and length of rectangle 2: ");
    double wid2 = sc.nextDouble();
    double len2 = sc.nextDouble();

    Rectangle r1 = new Rectangle(wid, len);
    Rectangle r2 = new Rectangle(wid2, len2);


    System.out.println("\nRectangle Information: ");
    boolean isRotated = (r1.getLength() == r2.getWidth()) && (r2.getLength() == r1.getWidth());
    System.out.println("It is " + isRotated + " that it can be Rotated.");
    boolean isCongruent = (r1.equals(r2) || isRotated);
    System.out.println("It is " + isCongruent + " that it can be Congruent.");
    boolean isSimilar = ((isCongruent) || (r1.getLength() / r2.getLength()) == (r1.getWidth() / r2.getWidth()));
    System.out.println("It is " + isSimilar + " that it can be Similar.");
  }

}
