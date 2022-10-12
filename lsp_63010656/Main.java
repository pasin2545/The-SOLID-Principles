public class Main
{

  private static final int width = 4;
  private static final int height = 5;
  public static void main (String[]args)
  {

    Rectangle reg1 = new Rectangle (width, height);
      System.out.println ("==== Rectangle ====");
      System.out.println ("Width = " + width);
      System.out.println ("Height = " + height);
      System.out.println ("Area = " + reg1.getArea());


    Square sqe = new Square(5);
      System.out.println ("====   Square  ====");
      System.out.println ("Width = " + sqe.gogo());
      System.out.println ("Height = " + sqe.gogo());
      System.out.println ("Area = " + sqe.getArea());
  }
}