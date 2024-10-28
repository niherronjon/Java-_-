public class MathDemo {
   public static void main(String[] args)
{
      
      int x = 175;      int y = -184;  int z = 120;
      double x1 = 125.9;
      System.out.println("Math.abs(" + x + ")=" + Math.abs(x));
      System.out.println("Math.abs(" + y + ")=" + Math.abs(y));
      System.out.println("Math.ceil(" + x1 + ")=" +Math.ceil(x));
      System.out.println("Math.abs(-0)=" + Math.abs(-0));
      System.out.println("Math.max(" + x + "," + z + ")=" + Math.max(x, y));
   }
}